public class linked_list_doubly1 {
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
    public void addFirst(int data){
        listNode newnode = new listNode(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        newnode.prev = null;
        head = newnode;
    }
    public void addlast(int data){
        listNode newnode = new listNode(data);
        if(head == null){
            head = newnode;
            return;
        }
        listNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newnode;
        newnode.prev = curr;
    }
    public void deletefirst(){
        if(head == null){
            return;
        }
        head = head.next;
        head.prev = null;
    }
    public void deletelast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            return;
        }
        listNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.prev.next = null;
    }
    public void display(){
        listNode curr = head;
        while(curr != null){
            System.out.print(curr.data+" <--> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        linked_list_doubly1 obj = new linked_list_doubly1();
        obj.addFirst(20);
        obj.addFirst(10);
        obj.addlast(30);
        obj.addlast(40);
        obj.display();
        obj.deletefirst();
        obj.display();
        obj.deletelast();
        obj.display();
    }
}