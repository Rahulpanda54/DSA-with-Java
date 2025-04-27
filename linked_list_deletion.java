public class linked_list_deletion {
public listNode  head;
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
public void delete_first(){
    if(head == null) return;
    head = head.next;
}
public static void main(String[] args) {
    linked_list_deletion obj = new linked_list_deletion();
    obj.head = new listNode(10);
    obj.head.next = new listNode(20);
    obj.head.next.next = new listNode(30);
    obj.head.next.next.next = new listNode(40);
    obj.display();
    obj.delete_first();
    obj.display(); 
}
    
}