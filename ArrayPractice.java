import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] grades = new double[10]; // default value is 0.0
        double grade;
        String status;
        boolean go = true;
        int i = 0;

        while (go && i < grades.length) {
            System.out.println("Input the students grade: ");
            grade = in.nextDouble();
            // store the grade in the array
            grades[i] = grade;
            i++;

            System.out.println("Do you want to continue? (y/n)");
            status = in.next();

            if (status.equals("n")) {
                go = false;
            }
        }

        System.out.println("Here is your list of grades: " + Arrays.toString(grades));

    }
}