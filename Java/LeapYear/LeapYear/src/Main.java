import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int year;
        boolean leapYear;
        
        System.out.print("Enter the year: ");
            Scanner in = new Scanner(System.in);
            year = in.nextInt();
        in.close();   
        if (year % 4 == 0){
            if (year % 100 != 0){
                leapYear = year % 400 != 0;   
            }
            else leapYear =true;
        }
        else leapYear = false;
        
        if (leapYear)
            System.out.println(year + " is a leap year!");
        else 
            System.out.println(year + " is not a leap year!");  
    }
}
