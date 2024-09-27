public class CircleArea {
    public static void main(String[] args) {
        // Define the radius
        double radius = 5.5;

        // Calculate the area of the circle
        double circleArea = Math.PI * Math.pow(radius, 2);

        // Print the result
        System.out.println("The area of the circle is " + String.format("%.2f", circleArea) + " square cm.");
    }
}