import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
         final int tries = 10000;
        Random g = new Random();
        
        int hits = 0;
        for (int i = 1; i <= tries; i++)
        {
          double r = g.nextDouble();
          double x = -1 + 2 * r;
            r = g.nextDouble();
          double y = -1 + 2 * r;
          
        if (x * x + y * y <=1) {hits++;}
        }
        
        double piEstimate = 4.0 * hits / tries;
        System.out.println("E for PI: " +piEstimate);
    }
}
