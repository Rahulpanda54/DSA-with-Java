public class linked_list_add_at_index_practise {
    public listNode head;
    public static class listNode {
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
    public void add_at_index(int index,int val){
        listNode newnode = new listNode(val);
        listNode curr = head;
        for(int i=1;i<index-1;i++){
         curr = curr.next;
        }
        newnode.next = curr.next;
        curr.next = newnode;
    }
    public static void main(String[] args) {
        linked_list_add_at_index_practise obj = new linked_list_add_at_index_practise();
        obj.head = new listNode(10);
        obj.head.next = new listNode(20);
        obj.head.next.next = new listNode(30);
        obj.display();
        obj.add_at_index(2, 100);
        obj.display();
    }
}