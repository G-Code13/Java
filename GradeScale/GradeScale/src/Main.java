import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
         Scanner scan = new Scanner(System.in);
        int g;
        do{
            System.out.print("Enter your total points between 0 and 1000: ");
            while (!scan.hasNextInt()){
                System.out.print("Enter a valid number!");
                scan.next();
            }
            g = scan.nextInt();
          }while (g <= 0);
            System.out.println("What What " + g);
        
            System.out.println();
                
        if (g <= 0 || g >= 1001){
             System.out.println("Please enter a valid number between 0 and 1000 to proceed.");
        }
        else;
                    
    if (g <= 1000 && g >= 900){
        System.out.println("Your grade is an A Congratulations!!");
    }
    else if (g <= 899 && g >= 800){
        System.out.println("Your grade is an B Good Work!!");
    }
    else if (g <= 799 && g >= 700){
        System.out.println("Your grade is an C You have passed this course!!");
    }
    else if (g <= 699 && g >= 600){
        System.out.println("Your grade is a D You may have to retake this course!!");
    }
    else if (g <= 599 && g >= 1){
        System.out.println("You have an F and are required to retake this course to proceed!!");
    }
    else;
    scan.close();
    }
}
//once the user enters the invalid info the program stops. change so the program will still run and start over from the beginning