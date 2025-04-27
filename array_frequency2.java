public class array_frequency2{
    public static void main(String[]args){
        int arr[] = {1,2,2,3,3,4,4,5,6};
        int fre[] = new int[arr.length];
        boolean vis[] = new boolean[arr.length];
        for(int i=0;i<vis.length;i++){
            vis[i] = false;
        }
        for(int i=0;i<arr.length;i++){
            if(vis[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    vis[j] = true;
                    count++;
                }
            }
            fre[i] = count;
        }
         for(int i=0;i<arr.length;i++){
            if(vis[i] == false){
                System.out.println(arr[i] + "  " + fre[i]);
            }
         }
    }
}