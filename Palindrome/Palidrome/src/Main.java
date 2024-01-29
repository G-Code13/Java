import java.util.Scanner;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        boolean flag = true;
        Scanner input = new Scanner(System.in);

        while (flag) {
            try {
                // Scanner input = new Scanner(System.in);
                System.out.print("\nEnter a whole number: ");
                int number = input.nextInt();
                // input.close();

                Palindrome palindrome = new Palindrome();
                if (palindrome.palindrome(number)) {
                    System.out.println(number + " is palindrome");
                } else {
                    System.out.println(number + " is not palindrome");
                }
            } catch (Exception e) {
                Exceptions.exceptPalindrome();
            }

            // Scanner input1 = new Scanner(System.in);
            System.out.print("\nWould you like to enter another number? Y/N ");
            String answer = input.next();
            // input1.close();

            // add a try catch here in case the user does not enter y or n
            if (answer.equalsIgnoreCase("Y")) {
                flag = true;
            }
            if (answer.equalsIgnoreCase("N")) {
                System.out.println("Thanks for playing\n");
                flag = false;
            }


            // int[] nums = new int[7];
            // nums[0] = 45;
            // System.out.println(Arrays.toString(nums));

            // int[] numbers = { 4, 7, 9, 11, 56, 3 };
            // System.out.println(Min.min(21, numbers));
        }
    }
}
