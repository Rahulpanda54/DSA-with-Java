public class circularlinkedlist{
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
           listNode current = head;
           if(head != null){
            do{
            System.out.print(current.data+"-->");
            current = current.next;
           }
           while(current != head);
       }
       System.out.println("head");
    }
    public static void main(String[] args) {
        circularlinkedlist obj = new circularlinkedlist();
        obj.head = new listNode(10);
        listNode second = new listNode(20);
        listNode third = new listNode(30);

        obj.head.next = second;
        second.next = third;
        third.next = obj.head;
        
        obj.display();
    }
    }

