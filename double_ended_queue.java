import java.util.*;
public class double_ended_queue {
    public static void main(String[] args) {
        Deque<Integer>q1 = new ArrayDeque<>();
        q1.addFirst(1);
        q1.addLast(2);
        q1.addLast(3);
        q1.addLast(4);
        System.out.println(q1);
        System.out.println(q1.removeLast());
        q1.removeLast();
        System.out.println(q1);
        System.out.println(q1.peek());

    }
    
}
