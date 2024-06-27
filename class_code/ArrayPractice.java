package class_code;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] grades = new double[10]; // default value is 0.0
        double grade;
        double sum = 0;
        double classAverage;
        boolean go = true;
        int i = 0;

        while (go && i < grades.length) {
            System.out.println("Input the students grade: ");
            grade = in.nextDouble();
            // store the grade in the array
            grades[i] = grade;
            sum += grade;
            i++;

            // System.out.println("Do you want to continue? (y/n)");
            // status = in.next();

            // if (status.equals("n")) {
            // go = false;
            // }
        }
        in.close();

        classAverage = sum / grades.length;
        System.out.println("Your class average is " + classAverage);

    }
}