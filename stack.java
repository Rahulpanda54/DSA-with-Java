import java.util.Stack;
class stack{
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack();
        stack.push(1);    // push function
        stack.push(2);      
         System.out.println(stack);
        stack.pop();            // pop fuction
        System.out.println(stack);
        System.out.println(stack.peek());   // peek find
        System.out.println(stack.empty());   // find stack is empty or not..
        System.out.println(stack.search(1));  // search the position of element in stack...
        System.out.println(stack.hashCode());
    }
}