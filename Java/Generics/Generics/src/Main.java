import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        
        MyPrinter<String> string1 = new MyPrinter<String>("I am printing");
            string1.show();
            System.out.println();

        MyPrinter<Integer> numbers = new MyPrinter<Integer>(235_897_001);
            numbers.show();
            System.out.println();

        MyPrinter2<Double, String > doubleStrings = new MyPrinter2<Double,String>(55.67, "We added a value and a string");
            doubleStrings.show();

        HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "Greg");
            map.put(2, "Mckenzie");
            map.put(3, "Bertha");
            map.put(4, "Betty");
            map.put(5, "George");
        System.out.println(map);
    }
}
