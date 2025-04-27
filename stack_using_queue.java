import java.util.*;
public class stack_using_queue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer>q2 = new LinkedList<>();
    public void push(int data){
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(data);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    public int peek(){
        if(q1.isEmpty()){
            return -1;
        }
         return q1.peek();
    }
    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
         return q1.remove();
    }
    public static void main(String[] args) {
    stack_using_queue stack = new stack_using_queue();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.pop();
    System.out.println(stack.peek()); 
    stack.pop();
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.peek());         
    }
}
