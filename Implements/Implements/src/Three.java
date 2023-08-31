public class Three implements One, Two{

    @Override
    public void methodTwo() {
        System.out.println("I am method two using implements through class three");
        
    }

    @Override
    public void methodOne() {
        System.out.println("I am method one using implements through class three");
        
    }
    
    public void methodThree(){
        System.out.println("I am method three that takes all implementations");
    }
}
