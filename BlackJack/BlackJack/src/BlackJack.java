import java.util.Scanner;  

public class BlackJack {

   
    public static void main(String[] args) {
//Welcome message
    System.out.println("Welcome to Blackjack!");
    System.out.println();
    
//Start game
  
//Scanner to enter bet
    int betAmt;
    int totalCash;
    boolean playerWins = true;
    boolean dealerWins = true;
    boolean bothBust = true;
    boolean dealerBust = true;
    boolean playerBust = true;
    boolean push = true;
    
    System.out.print("How much cash do you want to start with? ");
    //System.out.println("\n");

    Scanner scan = new Scanner(System.in);
    //Scanner cash = new Scanner(System.in);
        totalCash = scan.nextInt();
            if (totalCash <= 0)
                System.out.println("You need cash to play this game, come back with the money!");
            else{
                System.out.println();
    
    System.out.print("Starting cash:$ " +totalCash);
    System.out.println("\n");
    System.out.print("How much would you like to bet? ");
    //cash.close();

    //Scanner scan = new Scanner(System.in);
        betAmt = scan.nextInt();
            if (betAmt <= 0)
                System.out.println("Place a bet of $1 or more to play the game!");
            else{
          System.out.println();
          System.out.print("Let's Play some Blackjack!");
          System.out.println();
          
//Card suit, rank and value
       final String[] suit = {"Spades","Clubs","Diamonds","Hearts"};
       final String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
       final int[] rankValue = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
       
//Cards in the array
       int[] deckSuit = new int[52];
       int[] deckRank = new int[52];
       
//Create new deck       
        for (int suit1 = 0; suit1 < 4; suit1++){
          for (int rank1 = 0; rank1 < 13; rank1++){
            int i = suit1 * 13 + rank1;
                deckSuit[i] = suit1;
                deckRank[i] = rank1;
            }
        } 
        
//Shuffle
         for (int shuffle = 1; shuffle <=700; shuffle++){
            int i = (int)(Math.random()*52);
              int j = (int)(Math.random()*52);
                int temp = deckSuit[i];
                    deckSuit[i] = deckSuit[j];
                    deckSuit[j] = temp;
                    
                     temp = deckRank[i];
                     deckRank[i] = deckRank[j];
                     deckRank[j] = temp;
        }
         
//dealer and player get 2 cards and cards values added
    int dealerTotal = 0;
    int playerTotal = 0;
    int player;
    int dealer;
    
    System.out.println();
    System.out.println("Dealers hand is: " );
        for (dealer = 0; dealer < 2; dealer++)
          {
            System.out.printf("%s of %s   %d\n", rank[deckRank[dealer]], suit[deckSuit[dealer]], rankValue[deckRank[dealer]]);  
            dealerTotal = rankValue[deckRank[dealer]] + rankValue[deckRank[0]];
          }
    System.out.println();
    System.out.println("Dealers total is: " +dealerTotal);
    
    System.out.println();
    System.out.println("Players hand is: ");
        for (player = 2; player < 4; player++)
          { 
            System.out.printf("%s of %s  %d\n", rank[deckRank[player]], suit[deckSuit[player]], rankValue[deckRank[player]]);
            playerTotal = rankValue[deckRank[player]] + rankValue[deckRank[2]];
          }
    System.out.println();
    System.out.printf("Players total is: "+playerTotal);
    System.out.println();
    System.out.println();
    
//Ask player to hit or stay   
    System.out.println("Do you want to (h)hit or (s)Stand?");
        String hit = scan.next();
        
//player decides to stay
    if (hit.equalsIgnoreCase ("s")){
    }
    
//player decides to hit
    else if (hit.equalsIgnoreCase("h")){
       for (int h = 0; h < 1; h++){
            System.out.printf("Your new card is:  %s of %s  %d\n", rank[deckRank[player]], suit[deckSuit[player]], rankValue[deckRank[player]]);
        }
            playerTotal = playerTotal + rankValue[deckRank[player]];
    System.out.println();
    System.out.println("Your total after the hit is: " +playerTotal);
    System.out.println();
    }
    else;
    scan.close();
    

//player decides to stay2
/**     System.out.println("Do you want to (h)hit or (s)Stand?");
        String hit2 = scan.next();
    if (hit2.equalsIgnoreCase ("s")){
    }
    
//player decides to hit2
    else if (hit2.equalsIgnoreCase("h")){
       for (int h = 6; h < 1; h++){
        System.out.printf("Your new card is:  %s of %s  %d\n", rank[deckRank[player]], suit[deckSuit[player]], rankValue[deckRank[player]]);
        }
            playerTotal = playerTotal + rankValue[deckRank[player]] + rankValue[deckRank[6]];
    System.out.println();
    System.out.println("Your total after the hit is: " +playerTotal);
    System.out.println();
    }
    else;
 */

//Dealer hit or stay
    if (dealerTotal <= 16){
        for (int d = 0; d < 1; d++){
            System.out.printf("Dealer has taken a hit:  %s of %s  %d\n", rank[deckRank[dealer]], suit[deckSuit[dealer]], rankValue[deckRank[dealer]]);
        }
        dealerTotal = dealerTotal + rankValue[deckRank[dealer]];
        
    System.out.println();
    System.out.println("Dealer total after the hit is: " +dealerTotal);
        }
    
    System.out.println();

//statements to determine winner
//both bust
    if ((dealerTotal > 21) && (playerTotal > 21))
        System.out.println("There is no winner, both players bust, push!");
//Dealer bust
    else if ((dealerTotal > 21) && (playerTotal <= 21))
        System.out.println("Dealer bust player is the winner, collect payout!");
//Player bust    
    else if ((dealerTotal <= 21) && playerTotal > 21)
        System.out.println("Player bust dealer is the winner!");
//Tie = PUSH 
    else if (dealerTotal == playerTotal)
        System.out.println("Both hands are tied, push!");
//Dealer wins    
    else if (dealerTotal > playerTotal)
        System.out.println("Dealer is the winner!");
//Player Wins    
    else if (dealerTotal < playerTotal)
        System.out.println("Player is the winner, collect payout!");
    else 
        System.out.println("Error!");
     }
//cash payout           
    while (true){
        if (!playerWins){
            totalCash = totalCash + betAmt;
                System.out.println();        
        }
        else if (dealerWins){
            totalCash = totalCash + betAmt;
                System.out.println();
        }
        else if (!playerBust){
            totalCash = totalCash + betAmt;
                System.out.println();
        }
        else if (!dealerBust){
            totalCash = totalCash + betAmt;
                System.out.println();
        }
        else if (!bothBust){
            totalCash = betAmt;
                System.out.println();
        }
        else if (!push){
            totalCash = betAmt;
                System.out.println();
        }
        else{
            
        }
            System.out.println("Your total cash is:$ " +totalCash);
            System.out.println();
                break;
        }
    }
 }
}
 
