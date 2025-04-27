public class linked_list_doubly {
    public listNode head;
    public static class listNode{
        int data;
        listNode prev;
        listNode next;
        listNode(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
     
    public void display(){
        listNode curr = head;
        while(curr != null){
            System.out.print(curr.data+ " <--> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
        public static void main(String[] args) {
        linked_list_doubly obj = new linked_list_doubly();
        obj.head = new listNode(10);
        listNode second = new listNode(20);
        listNode third = new listNode(30);
        obj.head.prev = null;
        obj.head.next = second;
        second.prev  = obj.head;
        second.next = third;
        third.prev = second;
        third.next = null;
        obj.display();
    }
}