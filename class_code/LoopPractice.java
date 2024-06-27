package class_code;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the number of times you want to print: ");
        int count = in.nextInt();

        System.out.println("\n This is a while loop");
        // while loop
        while (i < count) {
            System.out.println(i);
            i++;
        }

        System.out.println("\n This is a do-while loop");

        // do-while loop
        // in a do-while loop it is guaranteed that the code inside the loop will be
        // executed at least once
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < count);

        System.out.println("\n This is a for loop");

        // in a for loop, initialization, condition and increment are all combined in
        // one line
        for (int j = 0; j < count; j++) {
            System.out.println(j);
        }

        // nested for loop
        for (int k = 0; k < count; k++) {

            System.out.printf("k = %d\n", k);

            for (int l = 0; l < k; l++) {
                System.out.printf("l = %d\n", l);

                // l++ executes here after the inner loop body
            }
            // k++ executes here after the inner loop
        }

        boolean flag = true;
        System.out.println("Enter 0 to exit the loop");

        while (flag) {
            System.out.println("Go Go Go");

            if (in.nextInt() == 0) {
                flag = false;
            }
        }
        in.close();
    }
}
