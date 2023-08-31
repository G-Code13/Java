public class Rectangle extends Shapes{

    public double length;
    public double width;
   
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
        System.out.println("Rectangle constructor");
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + " Area: "  + area();
    }
    
}
