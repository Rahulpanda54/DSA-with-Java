public class queue_using_linkedlist {
      static class listNode{
        int data;
        listNode next;
        listNode(int data){
            this.data = data;
            this.next = null;
        }
    } 
    static class Queue{
        static listNode head = null;
        static listNode tail = null;
        public boolean isEmpty(){
            return head == null & tail == null;
        }
        public void add(int data){
            listNode newnode = new listNode(data);
            if(tail == null){
                tail = head = newnode;
                return;
            }
            tail.next = newnode;
             tail = newnode;
        }
        public int remove(){
            if(isEmpty()){
                return -1;
            }
            if(head == tail){
                tail = null;
            }
            int front = head.data;
            head = head.next;
            return front;
        }
        public int peek(){
            return head.data;
        }
    }
    public static void main(String[] args) {
            Queue obj = new Queue();
            obj.add(10);
            obj.add(20);
            obj.add(30);
            obj.add(40);
            obj.add(50);
            while(!obj.isEmpty()){
                System.out.println(obj.peek());
                obj.remove();
       }
    }
}
