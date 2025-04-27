public class queue_using_array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public  boolean isempty(){
            return rear == -1;
        } 
        public void add(int data){
            if(rear == size-1){
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        public int remove(){
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
                rear = rear-1;
            return front;
        }
        public int peek(){
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.isempty());
        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();
           }
    }
}
