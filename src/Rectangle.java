public class Rectangle {
    public int height;
    public int width;

    public Rectangle(){
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int area(){
        return this.height * this.width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle rect_2 = new Rectangle(10, 20);

        System.out.printf("The width and height of the rectangles are %d - %d and %d - %d\n",
                r.width, r.height, rect_2.width, rect_2.height);
        System.out.printf("The area of the rectangles are %d and %d respectively.",
                r.area(), rect_2.area());
    }
}
