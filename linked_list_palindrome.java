public class linked_list_palindrome {
    public listNode head;
    public static class listNode{
        int data;
        listNode next;
        listNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean ispalindrome(listNode head){
        listNode slow = head;
        listNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        listNode temp = reverse(slow.next);
        slow.next = temp;
        listNode p1 = head;
        listNode p2 = slow.next;
        while(p2 != null){
            if(p1.data != p2.data){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public static listNode reverse(listNode head){
        if(head == null || head.next == null){
            return head;
        }
     listNode newnode = reverse(head.next);
         head.next.next = head;
          head.next = null;
          return newnode;

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
        linked_list_palindrome obj = new linked_list_palindrome();
        obj.head = new listNode(10);
        obj.head.next = new listNode(20);
        obj.head.next.next = new listNode(20);
        obj.head.next.next.next = new listNode(10);
        obj.display();
     System.out.println(obj.ispalindrome(obj.head));
    } 
}