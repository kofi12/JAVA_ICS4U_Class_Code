package src;

import java.util.Scanner;

public class SelectionExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 1000: ");
        int number = in.nextInt();

        // combine 2 boolean expressions into one
        if (number < 1 || number > 1000) {
            // We utilized nested if statements ot make sure we don't get for even or odd if
            // the number is outside the range
            System.out.println("number is outside the accepted range!!");
        } else {
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
        in.close();

    }
}