import java.util.*;

public class Queue_using_2stack {
  public static class queue{
      static Stack<Integer>s = new Stack<>();
     static Stack<Integer>st2 = new Stack<>();
        public static boolean isEmpty(){
            return s.isEmpty();
        }
        public static void add(int data){
            while(!s.isEmpty()){
                st2.push(s.pop());
            }
            s.push(data);
            while (!st2.isEmpty()) {
                s.push(st2.pop());
            }
        }
        public static int remove(){
            return s.pop();
        }
        public static int peek(){
            return s.peek();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(10);
        q.add(20);
        q.add(30);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}