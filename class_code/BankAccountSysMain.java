package class_code;

import java.util.Scanner;

public class BankAccountSysMain {
    public static void main(String[] args) {

        boolean done = false;
        int option;
        double amount;
        Scanner input = new Scanner(System.in);
        BankAccount acct = new BankAccount(12345, 1000);

        System.out.println("OPTIONS");
        System.out.println("1. Account Info");
        System.out.println("2. Monthly Interest Earn");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Exit");
        System.out.print("Select an Option: ");
        option = input.nextInt();

        while (!done) {
            if (option == 1) {
                System.out.println("Account Number :" + acct.acctNum);
                System.out.println("Account Balance : " + acct.acctBal);
                System.out.println("");
                System.out.print("Select an Option: ");
                option = input.nextInt();

            } else if (option == 2) {
                System.out.printf("Monthly Interest : $%10.2f\n", acct.getMonthlyInterest());
                System.out.print("Select an Option: ");
                option = input.nextInt();

            } else if (option == 3) {
                System.out.println("Amount to deposit : ");
                amount = input.nextDouble();
                acct.deposit(amount);
                System.out.print("Select an Option: ");
                option = input.nextInt();

            } else if (option == 4) {
                System.out.println("Amount to withdraw : ");
                amount = input.nextDouble();
                if (acct.withdraw(amount)) {
                    System.out.println("Withdraw " + amount + ". Success.");
                } else {
                    System.out.println("Account balance insufficient.");
                }
                System.out.print("Select an Option: ");
                option = input.nextInt();

            } else if (option == 5) {
                System.out.println("Thank you for banking with us!! Hope to see you soon");
                done = true;

            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }
}