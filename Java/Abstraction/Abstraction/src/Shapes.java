public abstract class Shapes {
    
    String color;

    public abstract double area();
    public abstract String toString();

    public Shapes(String color){
        this.color = color;
        System.out.println("Shapes constructor");
    }

    public String getColor() {
        return color;
    }
}
