import java.util.*;
public class dijkstra_algorithm {
    static class edge{
        int src;
        int dest;
        int wt;
        edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void create(ArrayList<edge>graph[]){
         for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
         }
         graph[0].add(new edge(0, 1,2));
         graph[0].add(new edge(0, 2,4));
         graph[1].add(new edge(1, 2,1));
         graph[1].add(new edge(1, 3,7));
         graph[2].add(new edge(2, 4,3));
         graph[3].add(new edge(3, 5,1));
         graph[4].add(new edge(4, 3,2));
         graph[4].add(new edge(4, 5,5));
    }
    public static class pair implements Comparable<pair>{
        int Node ;
        int dist;
        public pair(int n,int d){
            this.Node = n;
            this.dist = d;
        }
        public int compareTo(pair p2){
            return this.dist - p2.dist;
        }
    }
    public static void dijkstra(ArrayList<edge>graph[],int src,int V){
        PriorityQueue<pair>pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for(int i=0;i<V;i++){
            if(i  != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];
        pq.add(new pair(0,0));
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.Node]){
                vis[curr.Node] = true;
            }
            for(int i=0;i<graph[curr.Node].size();i++){
                edge e = graph[curr.Node].get(i);
                int u = e.src;
                int v = e.dest;
                if(dist[u] + e.wt < dist[v]){
                    dist[v] = dist[u] + e.wt;
                    pq.add(new pair(v, dist[v]));
                } 
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge>graph[] = new ArrayList[v];
        create(graph);
        dijkstra(graph, 0, v);
    } 
}
