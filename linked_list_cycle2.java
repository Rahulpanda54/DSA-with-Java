public class linked_list_cycle2 {
    public Node head;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static boolean iscycle(Node head){
        if(head == null || head.next == null){
            return false;
        }
        Node hare = head;
        Node turtle = head;
        while(hare != null && hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
    public static Node cycleStart(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node hare = head;
        Node turtle = head;
        while(hare != null && hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;

            if(hare == turtle){
                turtle = head;

                while(hare != turtle){
                    hare = hare.next;
                    turtle = turtle.next;
                }
                return turtle;
            }
        }
        return null;
    }
    public static void removeCycle(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node hare = head;
        Node turtle = head;
        while(hare != null ||  hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;

            if(hare == turtle){
                break;
            }
        }
        if(hare == null || hare.next == null){
            return;
        }
        turtle = head;
        while(hare != turtle){
            hare = hare.next;
            turtle = turtle.next;
        }
        while(turtle.next != hare){
            turtle = turtle.next;
        }
        turtle.next = null;
    }

    public static void main(String[] args) {
        linked_list_cycle2 obj = new linked_list_cycle2();
        obj.head = new Node(10);
        obj.head.next = new Node(20);
        obj.head.next.next = new Node(30);
        obj.head.next.next.next = new Node(40);
        obj.head.next.next.next.next = obj.head.next;

        if(iscycle(obj.head)){
            System.out.println("cycle Exist : ");
        }

        else{
            System.out.println("No cycle exist : ");
        }
        System.out.println(obj.cycleStart(obj.head).data);

        obj.removeCycle(obj.head);

        if(iscycle(obj.head)){
            System.out.println("cycle Exist : ");
        }

        else{
            System.out.println("No cycle exist : ");
        }
    }
}
