public class Fish implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("I am hunting smaller fish");
        
    }

    @Override
    public void flee() {
       System.out.println("I am hiding from a bigger fish");
       
    }
    
}
