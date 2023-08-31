import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Boolean vowel = false;
        
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a letter from the english alphabet: ");
               
                char v = input.next().charAt(0);
                input.close();
        
            switch(v){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                    if (vowel == false)
                        System.out.print("This is a vowel.");
            }
                    default -> System.out.print("This is not a vowel.");
            
            }
        input.close();
        //improve this program by adding a way for the user to exit or keep guessing
    }
}
