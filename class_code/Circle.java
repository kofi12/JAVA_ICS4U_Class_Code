public class Circle {
    int radius;
    String colour;

    public Circle(int r, String c) {
        this.radius = r;
        this.colour = c;
    }

    public int getRadius() {
        return this.radius; // the keyword 'this' refers to the object that is calling this method
    }

    public String getColour() {
        return this.colour;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}