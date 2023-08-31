public class Employee extends Company{
    
    public Employee(){

    }

    public Employee(String name, String employeeId, int salary){
        super(name, employeeId, salary);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeID(){
        return employeeId;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    // public void display(){
    //     System.out.println("Name: " + name + " ID: #" + employeeId + " Salary: $" + salary);
    // }

    @Override
    public String toString() {
        return "Name: " + getName() + " ID: #" + getEmployeeID() + " Salary: $" + getSalary();
    }
    
}
