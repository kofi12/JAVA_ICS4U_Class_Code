import java.util.Scanner;

public class StringForm {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int number = input.nextInt();
       boolean isEven = (number % 2 == 0);
       boolean isSingleDigit = number < 10;

       if(isEven && isSingleDigit) {
           System.out.println(number + " is even and is a single digit");
       }
       else if(isEven && !isSingleDigit) {
           System.out.println(number + " is even and not a single digit");
       }
       else if(!isEven && isSingleDigit) {
           System.out.println(number + " is a single digit and odd");
       }
       else{
           System.out.println(number + " is not a single digit and odd");
       }

       if(number > 3){
           System.out.println(number + " is greater than 3");
       }

       // continue in the program
        // nested if statements

    }
}
