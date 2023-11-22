import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Utility {

    //gets the average height of the players list
    static double averagePlayerHeight(List<Players> players){
        double sum = 0;
        for(Players player : players){
            sum += player.getPlayerHeight() / players.size();
        }
        return sum;
    };

    //gets the tallest player on the team
    static double tallestPlayer(List<Players> players){
        double tallest = 0;
        for(Players player : players){
            if(player.getPlayerHeight() > tallest){
                tallest = player.getPlayerHeight();
            }   
        }
        return tallest;
    };

    //input validation for integers
    public static int validateInteger(String message, Scanner in) {
        boolean done = false;
        int result = 0;
        while(!done){
            try {
                System.out.print(message);
                result = in.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                continue;
            } catch (Exception e) {
                continue;
            }
        }
        return result;
    }

    public static double validateDouble(String message, Scanner in) {
        boolean done = false;
        double result = 0;
        while(!done){
            try {
                System.out.print(message);
                result = in.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                continue;
            } catch (Exception e) {
                continue;
            }
        }
        return result;
    }

    public static String validateString(String message, Scanner in) {
        boolean done = false;
        String result = "";
        while(!done){
            try {
                System.out.print(message);
                result = in.next();
                done = true;
            } catch (InputMismatchException e) {
                continue;
            } catch (Exception e) {
                continue;
            }
        }
        return result;
    }
}