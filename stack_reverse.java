import java.util.*;
public class stack_reverse {

    public static void main(String[] args) {
           Stack<Integer>st  = new Stack<>();
           st.push(1);
           st.push(2);
           st.push(3);
           st.push(4);
           System.out.println(st); 
        //    System.out.println(st.pop());
           Stack<Integer>st2 = new Stack<>();
           while(st.size()>0){
            st2.push(st.pop());
           }
           System.out.println(st2);

    }
    
}
