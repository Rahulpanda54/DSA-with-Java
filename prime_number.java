import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int flag = 0;
        if(n == 2){
            System.out.println("prime number: ");
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag = 1;
                }
            }
        }
        if(flag == 0){
            System.out.println("prime number");
        }
        else {
            System.out.println("not an prime number...");
        }
    }
}