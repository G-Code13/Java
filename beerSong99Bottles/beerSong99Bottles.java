
public class beerSong99Bottles {
  public static void main(String[] args) {
    int numBeers = 99;
    String beer = "bottles";

    while(numBeers > 0){
        System.out.println(numBeers + " " + beer+ " of beer on the wall.");
        System.out.println(numBeers + " " + beer+ " of beer.");
        System.out.println("");
        System.out.println("Take one down, pass it around.");
        System.out.println("");
            numBeers-=1;
    if (numBeers == 1){
        beer = "bottle";
      }
    if (numBeers > 0){
        System.out.println(numBeers + " " + beer+ " of beer on the wall.");
      }
      else{
        System.out.println("No more bottles of beer on the wall.");
      }
    }
  }
}
