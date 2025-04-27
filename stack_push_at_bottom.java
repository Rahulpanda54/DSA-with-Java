import java.util.Stack;
public class stack_push_at_bottom {
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
        st.push(100);
        while(st2.size() > 0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
    
}
