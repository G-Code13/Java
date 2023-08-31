public class Constructor {
  
  int employeeNumber;
  String name;

  //Empty constructor
  public Constructor() {
    System.out.println("This is an empty constructor/default printing from the constructor class!");
  } 

  public Constructor(int employeeNumber, String name) {
    this.employeeNumber = employeeNumber;
    this.name = name;
  }
  
  //Constructors with parameters
  public Constructor(String name){
    System.out.println("A constructor with one parameter printing from the constructor class: Name: " + name);
  }//will only allow one output = name

  public Constructor(int employeeNumber){
    System.out.println("A constructor with one parameter printing from the constructor class: Employee Number: " + employeeNumber);
  }//will only allow one output = employee number

  public Constructor(String name, int employeeNumber){
    System.out.println("A constructor with two parameters printing from the constructor class: Name: " + name + ", Employee number: " + employeeNumber);//will print both = name and employee number
  }
}
