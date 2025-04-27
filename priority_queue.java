import java.util.PriorityQueue;
public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer>q = new PriorityQueue<>();
        q.add(5);
        q.add(2);
        q.add(4);
        q.add(3);
        q.add(1);
        System.out.println(q);
        // it is stored in the pattern of Min_heap concept....
        // but removed in the sorted order on its priority....
        //  in min heap element will be removed in sorted order and pririoty queue are based on min heap concept...
        System.out.println(q.peek());
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
    }   
}
