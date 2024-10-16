import java.util.Scanner;

public class Switching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7 to represent a day of the week: ");
        String day = in.nextLine();

        switch (day) {
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        in.close();
    }
}
