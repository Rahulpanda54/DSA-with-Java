import java.util.*;
public class stack_push_at_middle {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer>st2 = new Stack<>();
        int index = st.size()/2;
        while(st.size()> index){
            st2.push(st.pop());
        }
        st.push(100);
        while(st2.size() > 0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}