import java.util.Scanner;

public class TypeSafety {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name here: ");
        String name = in.nextLine();
        System.out.print("How old are you: ");
        int age = in.nextInt();
        String expression = "Hello " + name + " you are " + age + " years young";

        System.out.println(expression);
    }
}
