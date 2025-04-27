import java.util.*;
public class stack_next_Greater_element {
    public static void  NGE(int arr[]){
        Stack<Integer>st = new Stack<>();
        int res[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,8,6,3,4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        NGE(arr);
        
    }
    
}
