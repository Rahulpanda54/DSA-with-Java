import java.util.Scanner;
    class ATM{
        float balance;
        int PIN = 5674;

        public void check() {
            System.out.println("enter your pin: ");
            Scanner sc = new Scanner(System.in);
            int entered_pin = sc.nextInt();
            if (entered_pin == PIN) {
                menu();
            } else {
                System.out.println("enter a valid pin");
            }
        }

        public void menu() {
            System.out.println("Enter your choice: ");
            System.out.println("1. check account balance");
            System.out.println("2. withdraw money ");
            System.out.println("3. deposit money");
            System.out.println("4. EXIT");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if (option == 1) {
                checkbalance();
            } else if (option == 2) {
                withdrawMoney();
            } else if (option == 3) {
                depositmoney();
            } else if (option == 4) {
                System.out.println("enter a valid choice");
                menu();
            } 
        }

        public void checkbalance() {
            System.out.println("balance: " + balance);
            menu();
        }

        public void withdrawMoney() {
            System.out.println("enter the amount you want to withdraw");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if (amount > balance) {
                System.out.println("insufficient balance");
            } else {
                balance = balance - amount;
                System.out.println("money withdrawl successfully");
            }
            menu();
        }

        public void depositmoney() {
            System.out.println("Enter the Amount");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            balance = balance + amount;
            System.out.println("money deposit successfully");
        }

        public class Main{
            public static void main(String[] args) {
                ATM obj = new ATM();

                obj.check();
                obj.menu();
                obj.checkbalance();
                obj.withdrawMoney();
                obj.depositmoney();

            }
        }
    }

