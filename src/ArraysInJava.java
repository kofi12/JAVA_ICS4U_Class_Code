import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] studentMarks = new int[3];
        int totalMarks = 0;
        int classAverage;

        String s = "We always encounter problems where we want to store a collection of data, but each variable may only store one\n" +
                "thing. This is where Array comes in. Array is a collection of data with the same type.";

        String[] t = s.split("\\.");
        System.out.println(Arrays.toString(t));

//        for(int i = 0; i < studentMarks.length; i++){
//            System.out.print("Enter a student's mark: ");
//            studentMarks[i] = in.nextInt();
//            System.out.printf("i: %d%n", i);
//            totalMarks = totalMarks + studentMarks[i];
//        }
//        classAverage = totalMarks / studentMarks.length;
//
//        System.out.printf("The class average in this class was %d%n", classAverage);
//        System.out.println(Arrays.toString(studentMarks));
    }
}
