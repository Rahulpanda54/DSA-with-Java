import java.util.*;
public class stack_balanced {
    public static boolean isbalanced(String str){
        Stack<Character>st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){    // for pushing the brackets....
                st.push(ch);
            }
            else{            // for poping the brackets / for  closing ' ) ' brackets , if there is no opening brackets then return false.. 
                if(st.size() == 0){
                    return false;
                }
                if(st.peek() == '('){
                    st.pop();
                }
            }
        }
        if(st.size() > 0){
         return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String str = "(()))((";
        String str1 = "(((())))";
        System.out.println(isbalanced(str));
        System.out.println(isbalanced(str1));
    } 
}