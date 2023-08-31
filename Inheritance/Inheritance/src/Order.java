public class Order extends SideItem{
 

  public Order(){

  }
  public Order(double amt){

  }
  public void makeChicken(double amt){
    System.out.println("You ordered chicken");
  }

  public void makeFish(double amt){
    System.out.println("You ordered fish");
  }

  public void makeSteak(double amt){
    System.out.println("You ordered steak");
  }

  public void makePasta(double amt){
    System.out.println("You ordered the pasta");
  }
  
  public void makeChefSpecial(double amt){
    System.out.println("You ordered the special.. Ribs");
  }
}
