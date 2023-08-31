import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        
        for (int i = 6; i >= 0; i--){
            for( int j =1 ; j <= i; j++){
            System.out.print(j);//prints from 1 thru 6 until 1 is left
            //System.out.print(i);//prints six 6's on one line five 5's....etc until you reach 1
            }
            System.out.println();
        }
        //prints the current date
        Date now = new Date();
        System.out.println(now);
    }
}
