public class Main {
    public static void main(String[] args) throws Exception {
        //Animals
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
        System.out.println("");

        //ByTwo's Counting
        ByTwo byTwo = new ByTwo();
        
        for(int i = 0; i < 5; i++){
            System.out.println(byTwo.getNext());
        }
        System.out.println(" ");

        //ByThree's Counting
        ByThree byThree = new ByThree();

        for (int i =0; i < 5; i++){
            System.out.println(byThree.getNext());
        }
    }
}
