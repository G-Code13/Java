import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       
        double v1 = 90, v2 = 75, result;
        String code;

        Scanner input = new Scanner(System.in);
        //     System.out.print("Enter any decimal number: ");
        // v1 = input.nextDouble();
        //     System.out.print("Enter another decimal number: ");
        // v2 = input.nextDouble();
            System.out.print("Enter a for add, b to subtract, c to multiply, d to divide, e to see the remainder! ");
            code = input.nextLine();
        input.close();
        
        switch(code){
            case "a": 
                //double v1 = 9, v2 = 11;
                result = v1 + v2;
                System.out.println(result);
                break;
            case "b":
                result = v1 - v2;
                System.out.println(result);
                break;
            case "c":
                result = v1 * v2;
                System.out.println(result);
                break;
            case "d":
                result = v1 / v2;
                System.out.println(result);
                break;
            case "e":
                result = v1 % v2;
                System.out.println(result);
                break;
            default:
                    System.out.println("Enter a valid letter");
        }
        //System.out.println(result);    
    }
}
