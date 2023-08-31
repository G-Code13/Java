public abstract class Company {
    String name, employeeId;
    int salary;

    public Company(){

    }

    public Company(String name, String employeeId, int salary){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
}
