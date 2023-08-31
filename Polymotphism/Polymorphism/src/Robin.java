public class Robin extends Bird{
  
  //ploymorphism because its the same method name "SING" as in the parent class
  public void sing(){
    super.sing();//will print from the parent class
    System.out.println("La La La");
  }
}
