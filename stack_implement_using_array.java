public class stack_implement_using_array {
    public static class stack{
         int arr[] = new int[5];
         int index = 0;
        public void push(int data){
            arr[index] = data;
            index++;
        }
        public int pop(){
            if(index <= 0){
                return -1;
            }
            int top = arr[index-1];
            arr[index-1] = 0;
            index--;
            return top;
        }
        public int peek(){
            if(index <= 0){
                return -1;
            }
            return arr[index-1];
        }
        public boolean isEmpty(){
            if(index == 0){
                return true;
            }
            return false;
        }
        public void display(){
        for(int i=0;i<index;i++){
         System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public int size(){
            return index;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.pop();
        s.display();
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.size());

    }
    
}
