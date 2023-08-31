public class Main {
    public static void main(String[] args) throws Exception {
        //Constructors
        //Empty constructor
        Constructor constructor = new Constructor();//used in all code you can pass values in the ()

        System.out.println(constructor.employeeNumber);//shows zero
        System.out.println(constructor.name);//shows null
        System.out.println(" ");

        //Constructor with parameters
        System.out.println("This is a constructor with parameters printing from the Main: " + "Employee number: " + constructor.employeeNumber + ", Employee name: " + constructor.name);// shows zero and null for the values
        System.out.println(" ");

        new Constructor("Bobby Poff");
        new Constructor(86);
        new Constructor("Bobby Poff", 86);
        System.out.println(" ");

        //Methods
        Method.MethodName();
        Method.Driving();
    }
}
