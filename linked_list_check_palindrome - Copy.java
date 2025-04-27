public class linked_list_check_palindrome {
    public listNode  head;
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
    listNode last = head.next;
    while(last != null){
        last = last.next;
        second = second.next;
    }
    second.next = null;
 }

public void display(){
    listNode curr = head;
    while(curr != null){
        System.out.print(curr.data+"-->");
        curr = curr.next;
    }
    System.out.println("null");
   }
   public  void reverseIterative(){
    if(head == null || head.next == null){
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
   public listNode reverse_recursive(listNode head){
    if(head == null || head.next == null ){
        return head;
    }
    listNode newnode = reverse_recursive(head.next);
      head.next.next = head;
       head.next = null;
       return newnode;
   }
   public  listNode middle(listNode head){
    if(head == null){
        return head;
      }
            listNode hare = head;
            listNode turtle = head;
      while(hare.next != null && hare.next.next != null){
          hare = hare.next.next;
           turtle = turtle.next;
      }
             return turtle;
     }
     public  boolean isplaindrome(listNode head){
        if(head == null || head.next == null){
            return true;
        }
        listNode mid =  middle(head);
        listNode secondhalf = reverse_recursive(mid.next);
        listNode firsthalf = head;
        while(secondhalf != null){
            if(firsthalf.data != secondhalf.data){
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
     }
   public static void main(String[] args) {
    linked_list_check_palindrome obj = new linked_list_check_palindrome();
          obj.addFirst(20);
          obj.addFirst(10);
           obj.addlast(20);
           obj.addlast(10);
             obj.display();
             obj.reverseIterative();
             obj.display();
             System.out.println();
       if(obj.isplaindrome(obj.head)){
        System.out.println("linked list is palindrome:  ");
       }
       else{
        System.out.println("linked list is not an palindrome: ");
       }
   }    
}