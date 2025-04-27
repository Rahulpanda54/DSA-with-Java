public class circularlinkedlist2{
    public listNode head;
    public static class listNode {
        public int data;
        public listNode next;
        listNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
   public void display(){
    listNode curr = head;
    if(head != null){
        do{
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }while(curr != head);
    }
    System.out.println("head");
   }
           public static void main(String[] args) {
        circularlinkedlist2 obj = new circularlinkedlist2();
        obj.head = new listNode(10);
        listNode second = new listNode(20);
        listNode third = new listNode(30);
        obj.head.next = second;
        second.next = third;
        third.next = obj.head; 
        obj.display();
    }
    }

