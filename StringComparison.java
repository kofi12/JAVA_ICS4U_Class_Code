public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello World";
        String s4 = "Hello World";

        System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3)); // false
        // System.out.println(s1.equals(s4)); // true
    }
}
