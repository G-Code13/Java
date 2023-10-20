import java.util.HashMap;

public class MyPrinter2 <T, K>{

    private T theValue1;
    private K theValue2;

    MyPrinter2(T theValue1, K theValue2){
        this.theValue1 = theValue1;
        this.theValue2 = theValue2;
    };

    void show(){
        System.out.println(theValue1.getClass().getName() + " " + theValue2.getClass().getName());
        System.out.println(theValue1 + "\n" + theValue2);
    };

    HashMap<T, K> lastFirstNames = new HashMap<>();
};
