import java.util.*;
public class stack_delete_consequetive_words_in_a_sequence {
    public static void remove_consecutive_character(char arr[]){
       Stack<Character>st = new Stack<>();
       for(int i=0;i<arr.length;i++){
        if(st.isEmpty()){
        st.push(arr[i]);
       }
       else if(st.peek() == arr[i]){
        st.pop();
       }
       else{
        st.push(arr[i]);
       }
    } 
    System.out.println(st);
    }
    public static void main(String[] args) {
        char stack[] = {'a','b','b','c','c','d','e','c','e'};

        remove_consecutive_character(stack);
    }   
}