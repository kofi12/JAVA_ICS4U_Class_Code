public class LoopStuff {
    public static void main(String[] args) {
        int num = 0;

        while(num <= 3) {
            System.out.println("in while loop");
            num++;
        }

        int num2 = 3;
        do {
            System.out.println("in do while loop");
        } while(num2 > 3);
    }
}
