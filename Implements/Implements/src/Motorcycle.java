public class Motorcycle implements Vehicle{

    int speed; 
    int gear;

    @Override
    public void changeGears(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) {
       speed += increment;
    }

    @Override
    public void slowDown(int decrement) {
        speed -= decrement;
    }
    
    public void printStatus(){
        System.out.println("The motorcycle's Speed: " + speed + " The motorcycle's Gear: " +gear);
    }
}
