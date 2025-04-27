import java.util.Stack;
public class stack_practise {
    static class listNode{
        int data;
        listNode next;
        listNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        public static listNode head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            listNode newnode = new listNode(data);
            if(head == null){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public static int pop(){
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek(){
            return head.data;
        }
    }
    public static void main(String[]args){
       stack s = new stack();
       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);
       while(!s.isEmpty()){
        System.out.print(s.peek()+" ");
        s.pop();
       }
    }  
}