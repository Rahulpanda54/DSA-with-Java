public class doubly_linkedlist {
        public listNode head;
        public static class listNode {
            int data;
            public listNode next;
            public listNode previous;
    
            public listNode(int data) {
                this.data = data;
                this.next = null;
                this.previous = null;
            }
        }
            public void display(){
                listNode current = head;
                while(current != null){
                    System.out.print(current.data+"<-->");
                    current = current.next;
                }
                System.out.println("null");
            }
    
        public static void main(String[] args) {
            doubly_linkedlist obj = new doubly_linkedlist();
            obj.head = new listNode(10);
            listNode second = new listNode(20);
            listNode third = new listNode(30);
          obj.head.previous = null;
         obj.head.next = second;
         second.previous = obj.head;
          second.next = third;
          third.previous = second;
          third.next = null;
          obj.display();
        }
        }