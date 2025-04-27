public class linked_list_middle_element_delete {
    
        public listNode head;
        public static class listNode{
            int data;
            listNode next;
            listNode(int data){
                this.data = data;
                this.next = null;
            }
        }
        public void display(){
            listNode curr = head;
            while(curr != null){
                System.out.print(curr.data+"-->");
                curr = curr.next;
            }
            System.out.println("null");
        }
        public listNode delete_middle(listNode head) {
            listNode hare = head;
            listNode turtle = head;
            if(head.next == null){
                 return null;
            }
            while(hare.next.next != null && hare.next.next.next != null){
                turtle = turtle.next;
                hare = hare.next.next;
            }
             turtle.next = turtle.next.next; 
             return head; 
        }
    
        public static void main(String[] args) {
            linked_list_middle_element_delete obj = new linked_list_middle_element_delete();
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
            obj.delete_middle(obj.head);
            obj.display();
    
        }
    }
