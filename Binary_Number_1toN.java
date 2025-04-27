import java.util.*;
public class Binary_Number_1toN {
    public static void generate(int n){
    Queue<String>q = new LinkedList<>();
        q.add("1");
    for(int i=1 ;i <= n;i++){
        String curr = q.remove();
        System.out.print(curr +" ");
         q.add(curr + "0");
         q.add(curr + "1");
       }
  }
    public static void main(String[] args) {
          int n = 8;
          generate(n);
    }
}