public class linked_list_middle_element {
    public listNode head;
    public static  class listNode{
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
            System.out.print(curr.data+"--->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public void  get_middle(listNode head){
        listNode fast = head;
        listNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
         System.out.println("the middle element is: " + slow.data);
    }
    public static void main(String[] args) {
  linked_list_middle_element obj = new linked_list_middle_element();
        obj.head  = new listNode(10);
        listNode second = new listNode(20);
        listNode third = new listNode(30);
        listNode fourth = new listNode(40);
        listNode fifth = new listNode(50);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        obj.display();
        obj.get_middle(obj.head);

        
        
    }
    
}
