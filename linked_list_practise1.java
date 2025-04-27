public class linked_list_practise1 {
    public listNode head;
    public static class listNode{
        int data;
        listNode next;
        listNode(int data){
            this.data = data;
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
    }
    public void removeFirst(){
        if(head == null){
            return;
        }
        head = head.next;
    }
    public void removelast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        listNode second = head;
        listNode lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            second = second.next;
        }
        second.next = null;
    }
    public void reverseIterative(){
        if(head == null){
            return;
        }
        listNode prev = head;
        listNode curr = head.next;
        while(curr != null){
            listNode nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        head.next = null;
        head = prev;
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
        linked_list_practise1 obj = new linked_list_practise1();
        obj.addFirst(20);
        obj.addFirst(10);
        obj.addlast(30);
        obj.addlast(40);
        obj.display();
        // obj.removeFirst();
        // obj.display();
        // obj.removelast();
        // obj.display();
        obj.reverseIterative();
        obj.display();

    }
}