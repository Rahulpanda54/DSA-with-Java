public class linked_list_practise{
    public listNode head;
    public static class listNode{
        int data;
        listNode next;
        listNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(int data){
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
            head = newnode ;
            return;
        }
        listNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
          curr.next = newnode;
    }
    public void print(){
        if(head == null){
            return;
        }
        listNode curr = head;
        while(curr != null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
       linked_list_practise obj = new linked_list_practise();
       obj.addfirst(20);
       obj.addfirst(10);
       obj.addlast(30);
       obj.addlast(40); 
       obj.print();
    }
}