
    interface WaterBottle{
        String color = "Blue";

        void fillUp();
        void empty();
    }
public class Main implements WaterBottle{
    public static void main(String[] args) throws Exception {
        System.out.println(color);

        Main main = new Main();
        main.fillUp();
        main.empty();

    }
    @Override
    public void fillUp() {
        System.out.println("I am being filled");
        
    }
    @Override
    public void empty() {
        System.out.println("I am being emptied");  
    }
}
