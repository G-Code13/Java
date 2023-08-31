public class Main {
    public static void main(String[] args) throws Exception {
        
        Three three = new Three();
        three.methodOne();
        three.methodTwo();
        three.methodThree();
        System.out.println(" ");

        Bike bike = new Bike();
        bike.changeGears(3);
        bike.speedUp(45);
        bike.slowDown(30);
        bike.printStatus();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.changeGears(5);
        motorcycle.speedUp(97);
        motorcycle.slowDown(17);
        motorcycle.printStatus();
        System.out.println(" ");
    }
}
