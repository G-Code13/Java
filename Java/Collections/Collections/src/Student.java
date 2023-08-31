import java.util.Objects;

public class Student implements Comparable<Student>{
    
    private String name;
    private String ANumber;

    public Student(String name, String ANumber) {
        this.name = name;
        this.ANumber = ANumber;
    }

    public String getName() {
        return name;
    }

    public String getANumber() {
        return ANumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setANumber(String ANumber) {
        this.ANumber = ANumber;
    }
    public String toString(){
        return "Name: " + this.getName() + " A#: " + this.getANumber();
    }
    public boolean equals(Object otherObject){
        Student other = (Student) otherObject;
        return this.name.equals(other.name) && this.ANumber.equals(other.ANumber);
    }
    public int hashCode()
   {
      return Objects.hash(name, ANumber);
   }
    public int compareTo(Student other){
       return this.ANumber.compareTo(other.ANumber);
   }
}
