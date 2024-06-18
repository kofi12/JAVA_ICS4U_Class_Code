import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {

        int[] stuff = { 1, 4, 6 };
        int sum = sum1(stuff);
        double avg = average(stuff);
        System.out.println("The sum is " + sum + " and the average is " + avg);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum1(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static double average(int[] numbers) {

        double average;
        average = (double) sum1(numbers) / numbers.length;
        return average;
    }

}