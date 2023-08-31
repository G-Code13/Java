public class Main {
    public static void main(String[] args) throws Exception {
        
        Shapes circle = new Circle("Brown", 18);
        System.out.println(circle.toString());
        System.out.println(" ");

        Shapes rectangle = new Rectangle("Orange", 25.35, 15.76);
        System.out.println(rectangle.toString());
        System.out.println(" ");
    }
}
