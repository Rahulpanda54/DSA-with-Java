import java.util.*;
public class stack_middle_deletion {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer>st2 = new Stack<>();
        int index = (st.size()/2) + 1;
        while(st.size() > index){
            st2.push(st.pop());
        }
        st.pop();
        while (st2.size() > 0) {
            st.push(st2.pop());
        }
        System.out.println(st);
    }
    
}
