import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num >= 90) {
            System.out.println("evaluated the first if");
        }
        if(num >= 100) {
            System.out.println("evaluated the second if");
        }
        if(num >= 70) {
            System.out.println("evaluated the third if");
        }
        if(num >= 60){
            System.out.println("evaluated the fourth if");
        }
    }
}
