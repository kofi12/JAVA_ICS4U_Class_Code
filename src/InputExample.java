import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        Scanner inout = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = inout.nextLine();
        System.out.printf("Hello my name is %s\n", name);
        double money = inout.nextDouble();
        System.out.printf("I am so rich because I have %.2f dollars in my account\n", money);
        inout.close();

        /*
         *
         *
         *
         *
         *
         *
        */
    }
}