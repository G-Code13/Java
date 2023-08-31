import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
    double balance;//beginning balance
    double endBalance;// balance at the end of the year
    double rate = .05;//interest rate 
      
    Scanner scanner = new Scanner(System.in);//scanner to enter balance
        System.out.print("Enter beginning balance: $");
           balance = scanner.nextDouble();//scanner input
        scanner.close();

        for (int year = 1; year < 21; year++)//loop to count the 20 year investment
        { 
            endBalance = balance * Math.pow(1 + rate, year);
            
            System.out.printf("Total balance this year: $%.2f  "  ,endBalance);
                System.out.println();
        }
    }
}
