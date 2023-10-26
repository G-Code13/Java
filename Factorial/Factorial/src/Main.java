import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.printf("Can not enter a negative number: %d\n", number);
        } else {
            System.out.printf("The factorial of %d is %d.\n", number, Factorial.factorial(number));
        }
        input.close();
    };
};
