import java.util.*;
public class stack_queue_practise {
    public static class queue{
        Queue<Integer>q = new LinkedList<>();
      public  void push(int val){
        q.add(val);
      }
         public int pop(){
         for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
           }
          int ele = q.peek();
          q.remove();
           return ele;
        }
      public int peek(){
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int el = q.peek();
        q.add(q.remove());
        return el;
      }
      public boolean isempty(){
        return q.size() == 0;
      }
     
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        while(!q.isempty()){
            System.out.print(q.peek()+" ");
            q.pop();
        }       
        System.out.println();
        System.out.println(q.isempty());     
    }   
}