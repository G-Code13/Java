import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Maps {

    public static void main(String[] args) {

        Map<String,Integer> scores = new HashMap<>();
        scores.put("Sally", 95);
        scores.put("John", 88);
        scores.put("Beth", 100);
        System.out.println(scores);
       // Set keys = scores.keySet();
        for(String key: scores.keySet()){
            System.out.println(key + ": " + scores.get(key));
        }
        
        Map<Integer,Employee> emps = new HashMap<>();
        emps.put(11, new Employee("Sara", 77000));
        emps.put(9, new Employee("Mark", 99000));
        emps.put(15, new Employee("Gordon", 105000));
        System.out.println(emps);
        for(Integer key: emps.keySet())
        {
            System.out.println(key + " : " + emps.get(key));
        }
        
        Map<Student, ArrayList<Integer>> students = new TreeMap<>();
        students.put(new Student("Adam", "A00123"), new ArrayList<>(Arrays.asList(90, 95, 88)));
        students.put(new Student("Ema", "A00111"), new ArrayList<>(Arrays.asList(95, 77, 65)));
        students.put(new Student("Elizabeth", "A00111"), new ArrayList<>(Arrays.asList(100, 100, 100)));
        System.out.println(students);
        for(Student key : students.keySet())
        {
            System.out.println(key.getName()+ ": " + students.get(key) + " : " + getAverage(students.get(key)));
        }
    }
    
    public static double getAverage(ArrayList<Integer> numbers){
        double sum = 0;
        for(Integer n : numbers){
            sum += n;
        }
        return sum/numbers.size();
        
    }
    
}
