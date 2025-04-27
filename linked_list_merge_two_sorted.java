public class linked_list_merge_two_sorted {
    public listNode head;
    public static class listNode{
        int data;
        listNode next;
        listNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(listNode head){
        listNode curr = head;
        while(curr != null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static listNode merge(listNode temp1,listNode temp2){
        listNode list1 = temp1;
        listNode list2 = temp2;
        listNode head = new listNode(100);
        listNode temp = head;
        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                listNode a = new listNode(list1.data);
                temp.next = a;
                temp = a;
                list1 = list1.next;
            }
            else{
            listNode a = new listNode(list2.data);
            temp.next = a;
            temp = a;
            list2 = list2.next;
            }
        }
        if(list1 == null){
            temp.next = list2;
        }
        else{
            temp.next = list1;
        }
        return head.next;

    }
    public static void main(String[] args) {
     linked_list_merge_two_sorted obj = new linked_list_merge_two_sorted();  
     listNode a = new listNode(10);
        a.next = new listNode(30);
        a.next.next = new listNode(50);
        
        listNode b = new listNode(20);
        b.next = new listNode(40);
        b.next.next = new listNode(60);

        listNode newhead = merge(a, b);
        obj.display(newhead);
    }
}