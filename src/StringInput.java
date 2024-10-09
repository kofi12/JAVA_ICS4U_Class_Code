import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String message = input.nextLine();
        System.out.print(message);

    }
}
