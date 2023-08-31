import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // System.out.println(input.nextLine()); 

        // System.out.print("Enter your age in number format: ");
        // System.out.println(input.nextInt());

        System.out.print("Enter \"T\" for Male and press \"F\" for Female: ");
        System.out.println(input.nextBoolean());
        input.close();
    }
}
