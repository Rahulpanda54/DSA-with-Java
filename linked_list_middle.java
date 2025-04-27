public class linked_list_middle {
    public listNode head;
    public static class listNode{
        int data;
        listNode next;
        listNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int find_middle(listNode head){
        listNode hare = head;
        listNode turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle.data;
    }
    public void display(){
        listNode curr = head;
        while(curr != null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       linked_list_middle ob = new linked_list_middle();
       ob.head = new listNode(10);
       ob.head.next = new listNode(20);
       ob.head.next.next = new listNode(30);
       ob.head.next.next.next = new listNode(40);
               ob.display(); 
        System.out.println(ob.find_middle(ob.head));
    }
}