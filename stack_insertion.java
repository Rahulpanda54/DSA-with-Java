import java.util.*;
public class stack_insertion {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        int index = 2;
        int value = 7;
        Stack<Integer>st2 = new Stack<>();
        while(st.size()>index){
            st2.push(st.pop());
        }
        st.push(value);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }

    
}
