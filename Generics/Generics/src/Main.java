import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {

        MyPrinter<String> string1 = new MyPrinter<>("I am printing a string");
        string1.showClassName();
        System.out.println();

        MyPrinter<Integer> numbers = new MyPrinter<>(235_897_001);
        numbers.showClassName();
        System.out.println();

        MyPrinter2<Double, String> doubleStrings = new MyPrinter2<>(55.67, "We added a double and a string");
        doubleStrings.show();
        System.out.println();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Greg\n");
        map.put(2, "Mckenzie\n");
        map.put(3, "Bertha\n");
        map.put(4, "Betty\n");
        map.put(5, "George");
        System.out.println(map);
    }
}
