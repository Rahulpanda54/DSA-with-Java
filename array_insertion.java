import java.util.*;
import java.util.*;
public class array_insertion {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int [n+1];
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    System.out.println("enter the element you want to insert");
    int element = sc.nextInt();
     System.out.println("enter the position you want to insert");
    int position = sc.nextInt();
    for(int i=n;i>=position;i--){
        a[i]= a[i-1];
    }
    a[position-1] = element ;
    for(int i=0;i<=n;i++){
        System.out.print(a[i]+"  ");
    }
   } 
}