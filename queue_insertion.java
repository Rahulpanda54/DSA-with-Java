import java.util.*;
public class queue_insertion {
    public static void main(String[] args) {
        Queue<Integer>q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println(q1);
        Queue<Integer>q2 =  new LinkedList<>();
        int index = 2;
        int value = 10;
        while (q1.size()>index) {
            q2.add(q1.remove());
        }
         q2.add(value);
        while(q1.size()>0){
            q2.add(q1.remove());
        }
        System.out.println(q2);
    }  
}