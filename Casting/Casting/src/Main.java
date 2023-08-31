public class Main {
    public static void main(String[] args) throws Exception {
        
        Animal dog = new Dog();//upCasting
        dog.makeNoise();//pulled from the Dog class
        animalStuff(dog);//pulled from the animalStuff method
    
        System.out.println();

        Animal cat = new Cat();//upCasting
        cat.makeNoise();//pulled from the Cat class
        animalStuff(cat);//pulled from the animalStuff method


    }
    public static void animalStuff(Animal animal){
        animal.makeNoise();
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;//DownCasting
            dog.growl();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;//DownCasting
            cat.hiss();
        }
        
    }
}
