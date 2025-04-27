public class linked_list_length {
       public listNode head;
        public static class listNode {
               int data;
             public listNode next;
              public listNode previous;
    
            public listNode(int data) {
                this.data = data;
                this.previous = null;
                this.next = null;
            }
        }
            public  void display(){
                listNode current = head;
                while(current != null){
                    System.out.print(current.data + "-->");
                    current = current.next;
                }
                System.out.println("null");
            }
         public  int size(){
                listNode curr = head;
                int count = 0;
                while (curr != null) {
                    curr = curr.next;
                    count++;
                }
                return count;
            }
            public static void main(String[] args) {
            linked_list_length obj = new linked_list_length();    
            obj.head = new listNode(10);
            listNode second = new listNode(20);
            listNode third = new listNode(30);
            listNode fourth = new listNode(40);
            listNode fifth = new listNode(50);
            obj.head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            obj.display();
            System.out.println( "the size of linkedlist is: " + obj.size());
            
  }
}
