import java.util.*;
public class queue_using_stack1 {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer>st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        int pop = st2.pop();
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
        System.out.println("the pop element is : " + pop);
        System.out.println(st);

        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        int val = st2.peek();
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        System.out.println("the peek element is : " + val);


    }
}