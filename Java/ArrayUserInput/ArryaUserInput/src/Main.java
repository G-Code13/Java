import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int numbers = input.nextInt();

        System.out.println("Enter " + numbers + " number(s): ");
        int [] nums = new int[numbers];

        for(int i = 0; i < numbers; i++){
            nums[i] = input.nextInt();
        }

        System.out.println("The array of numbers you requested: ");
        for(int i = 0; i < numbers; i++){
            System.out.println(nums[i]);
        }
        input.close();
    }
}
