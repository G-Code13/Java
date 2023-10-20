public class MyPrinter<T> {

    private T printing;

    MyPrinter(T printing){
        this.printing = printing;
    };

    void showClassName(){
        System.out.println(printing.getClass().getName());
        System.out.println(printing);
    };
};
