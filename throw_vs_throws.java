import java.util.Scanner;
public class throw_vs_throws {
    // throw keyword is used to throw an exception explcitily by the programmer
    // throws keyword give an indication to the user of the program that the code may be throw an exception so might be prepare with try-catch block or use try-catch block for this programm....
    public static void divide(int a,int b) throws ArithmeticException{
        System.out.println(a/b);
    }
    public static void main(String[] args) {
       /*   Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        int a = sc.nextInt();
        System.out.println("enter b: ");
        int b = sc.nextInt();
        try{
            int c = a/b;
            if(b == 0){
                throw new ArithmeticException();
            }
            else{
            System.out.println("the o/p is: " + c);
         }
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero: " + e);
        }
            */  
try{
divide(3, 0);
}catch(ArithmeticException e){
  System.out.println("exception , cannot divide by zero:  " + e);
}
    }
}