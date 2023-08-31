import java.util.LinkedList;


public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> words = new LinkedList<>();

        words.addLast("abc");
        
        words.addLast("def");
        
        words.addLast("ghi");

        System.out.println(words);
        
        System.out.print(words.removeLast());
        
        System.out.print(": " + words.removeFirst());
        
        System.out.print(": " + words.removeLast());
    }
}
//def