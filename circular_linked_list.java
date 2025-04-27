public class circular_linked_list {

    public listNode head;
    public listNode tail;
    
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
        if(head == null && tail == null){
            head = tail = newnode;
            return;
        }
        else {
            newnode.next = head;
            head = newnode;
            tail.next = newnode;
        }
    }
    public void addLast(int data){
        listNode newnode = new listNode(data);
        if(head == null && tail == null){
            head = tail = newnode;
            tail.next = head;
        }
        else {
            newnode.next = head;
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void deletefirst(){
        if(head == null && tail == null){
            return;
        }
        head = head.next;
        tail.next = head;
    }
    public void deletelast(){
        if(head == null && tail == null){
            return;
        }

        listNode prev = head;
        while(prev.next != tail){
            prev = prev.next;
        }
        tail = prev;
        tail.next = head;
    }
    public void display(){
        System.out.print(head.data+"-->");
        listNode curr = head.next;
        while(curr != head){
            System.out.print(curr.data +"-->");
          curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public static void main(String[] args){
        circular_linked_list obj = new circular_linked_list();
        obj.addFirst(10);
        obj.addLast(20);
        obj.addLast(30);
        obj.display();
//        obj.deletefirst();
//        obj.display();
        obj.deletelast();
        obj.display();

    }
}