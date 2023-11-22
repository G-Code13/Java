import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Players> players = new ArrayList<>();
        players.add(new Players(13, "Greg", 6.3));
        players.add(new Players(4, "Mckenzie", 7.5));
        players.add(new Players(23, "Jordan", 6.6));
        players.add(new Players(8, "Kobe", 6.7));
        players.add(new Players(25, "Duncan", 7.1));

        boolean flag = true;
        Scanner input = new Scanner(System.in);

        while (flag) {

            System.out.println("\nPress 1 to add a player to the list!");
            System.out.println("Press 2 to edit a player to the list!");
            System.out.println("Press 3 to remove a player from the list!");
            System.out.println("Press 4 to get a list of the players!");
            System.out.println("Press 5 to get the average height of the team!");
            System.out.println("Press 6 to get the tallest player on the team");
            System.out.println("Press 7 to exit\n");

            System.out.print("Enter a number between 1 and 7: ");
            int number = input.nextInt();
            System.out.println();
            switch (number) {
                case 1:
                    // Add player
                    // int jerseyNumber = Utility.validateInteger("Enter jersey number: ", input);
                    System.out.print("Enter jersey number: ");
                    int jerseyNumber = input.nextInt();
                    // String playersName = Utility.validateString("Enter the player's name: ",
                    // input);
                    System.out.print("Enter the players name: ");
                    String playersName = input.next();
                    // double playersHeight = Utility.validateDouble("Enter player's height: ",
                    // input);
                    System.out.print("Enter players height: ");
                    double playersHeight = input.nextDouble();
                    players.add(new Players(jerseyNumber, playersName, playersHeight));
                    System.out.println("\nNew player added: " + players + "\n");
                    break;
                case 2:
                    // Edit players
                    System.out.print("Add a new player to the list: ");
                    int placeMent = input.nextInt();
                    System.out.print("Enter jersey number: ");
                    int jerseyNumber2 = input.nextInt();
                    System.out.print("Enter the players name: ");
                    String playersName2 = input.next();
                    System.out.print("Enter players height: ");
                    double playersHeight2 = input.nextDouble();
                    players.set(placeMent, new Players(jerseyNumber2, playersName2, playersHeight2));
                    System.out.print("Player has been removed: " + players + "\n");
                    break;
                case 3:
                    // remove player
                    System.out.print("Enter the index of the player to delete: ");
                    int removePlayer = input.nextInt();
                    players.remove(removePlayer);
                    System.out.print("\nPlayer has been removed: " + players + "\n");
                    break;
                case 4:
                    // List of Players
                    System.out.println("\nList of players: " + players + "\n");
                    break;
                case 5:
                    // Average Height
                    System.out.printf("\nThe teams average height is: %,.3f", Utility.averagePlayerHeight(players));
                    break;
                case 6:
                    // Tallest Player
                    System.out.printf("The tallest player is %,.1f feet tall", Utility.tallestPlayer(players));
                    System.out.println();
                    break;
                case 7:
                    flag = false;
                    System.out.println("Thank you! The program has ended!\n");
                    break;
                default:
                    System.out.println();
                    System.out.println("Make sure to enter a number between 1 and 7!\n");
                    flag = true;
                    break;
            }
        }
        input.close();
    }
}
