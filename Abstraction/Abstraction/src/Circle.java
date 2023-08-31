public class Circle extends Shapes{

    public double radius; 

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        System.out.println("Circle constructor");
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Color: " + super.getColor() + " Area: " + area();
    }
    
}
