public class linked_list_detect_cycle {
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
    public boolean has_cycle(listNode head){
        if(head == null){
            return false;
        }
        listNode hare = head;
        listNode turtle = head;
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

        if(hare == turtle){
            return true;
        }
    }
    return false;
}
    public static void main(String[] args) {
        linked_list_detect_cycle obj = new linked_list_detect_cycle();
        obj.head = new listNode(10);
        obj.head.next = new listNode(20);
        obj.head.next.next = new listNode(30);
        obj.head.next.next.next = new listNode(40);
        obj.display();
        System.out.println(obj.has_cycle(obj.head));
    }
}
