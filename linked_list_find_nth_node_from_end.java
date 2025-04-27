public class linked_list_find_nth_node_from_end {
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
    public static listNode find_nth_node_from_end(listNode head,int n){
           listNode slow = head;
            listNode fast = head;
          for(int i=1;i<=n;i++){
           fast = fast.next;
           }
          while(fast != null){
           slow = slow.next;
            fast = fast.next;
             }
           return slow;
         }
    public static void main(String[] args) {
        linked_list_find_nth_node_from_end obj = new linked_list_find_nth_node_from_end();
        obj.head = new listNode(10);
        obj.head.next = new listNode(20);
        obj.head.next.next = new listNode(30);
        obj.head.next.next.next = new listNode(40);
                obj.display();
    listNode q = find_nth_node_from_end(obj.head, 4);
           System.out.println(q.data);
  }   
}