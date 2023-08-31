public interface Six extends Four, Five{

    @Override
    default void methodFour() {
        System.out.println("From method Four");
    }

    @Override
    default void methodFive() {
        System.out.println("From method Five");
    }
    
    public static void methodSix(){
        System.out.println("From method Six");
    }
    
}
