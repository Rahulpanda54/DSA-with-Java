public class linked_list_add_at_index {
    public listNode head;
    public static class listNode{
        int data;
        listNode  next;
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
    public void add_at_index(int val,int index){
        listNode newnode = new listNode(val);
        listNode temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
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
        linked_list_add_at_index obj = new linked_list_add_at_index();
        obj.addFirst(20);
        obj.addFirst(10);
        obj.addlast(30);
        obj.addlast(40);
        obj.display();
        obj.add_at_index(100, 2);
        obj.display();
    }
}