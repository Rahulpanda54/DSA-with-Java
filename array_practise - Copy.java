import java.util.Scanner;
public class array_practise {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("enter the size:");
     int size = sc.nextInt();
     System.out.println("enter the elements: ");
     int elements[] = new int[size+1];
     for(int i=0;i<size;i++){
        elements[i] = sc.nextInt();
     }
     for(int i=0;i<elements.length;i++){
        System.out.print(elements[i]+" ");
     }
     System.out.println();
System.out.println("enter the elements which you want to insert: ");
int el = sc.nextInt();
System.out.println("enter the position: ");
int position = sc.nextInt();
for(int i=size;i>=position;i--){
elements[i] = elements[i-1];
}
elements[position-1] = el;
for(int i=0;i<=size;i++){
    System.out.print(elements[i]+" ");
}
}
}