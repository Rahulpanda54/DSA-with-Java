public class linked_list_find_nth_node_from_last_and_delete {
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
            System.out.print(curr.data+" --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public listNode remove_nth_node(listNode head,int n){
        if(head.next == null){
            return null;
        }
        int size = 0;
        listNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        int index_to_search = size-n;
        curr = head;
                int i=1;
        while(i<index_to_search){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        linked_list_find_nth_node_from_last_and_delete  obj = new linked_list_find_nth_node_from_last_and_delete();
        obj.head = new listNode(10);
        listNode second = new listNode(20);
        listNode third = new listNode(30);
        listNode fourth = new listNode(40);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        obj.display();
        obj.remove_nth_node(obj.head, 3);
        obj.display();
        
    }
}