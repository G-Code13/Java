import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        final int [] megaMillion = new int [5];
        final int [] bonusNumber = new int [1];
        int multiplier;
        int lottNumbers;
        
        for (int i = 0; i < 5; i++){
            lottNumbers = (int)(Math.random()*70 + 1);//getting random lott numbers 1 thru 70
                if (lottNumbers == 0){//making sure there are no zeros in the code
                        i+=1;
                    }
        for (int j = 0; j < i; j++){                    
                if (megaMillion[i] == lottNumbers){//checking duplicate numbers --(Had megaMillion[j] changed to [i])
                    lottNumbers = (int)(Math.random()*70 + 1);
                        i-=1;
                    }                                       
                } 
                    megaMillion[i] = lottNumbers;
                      // System.out.print(megaMillion[i] + " ");//printing lott numbers
        }             //This line is from the original code
    
              Arrays.sort(megaMillion);//sorting number in the array
                   System.out.print("Mega Million numbers: ");
        for (int num : megaMillion){
                        System.out.print(num + " ");               
        }
        System.out.println("");
        
    //Multiplier number Section
        System.out.print("Multiplier: ");        
        
        for (int x = 0; x < 1; x++){
            multiplier = (int)(Math.random()*25);//getting random multiplier number
                if (multiplier == 0){//making sure there are no zeros in the code
                        x+=1;
                    }           
        for (int a = 0; a < x; a++){
                    if (bonusNumber[x] == multiplier){//making sure there are no zeros in the code
                        multiplier = (int)(Math.random()*25 + 1);
                            x-=1;
                    }
                }
                    bonusNumber[x] = multiplier;
                        System.out.print(multiplier + " ");//printing multiplier
        }           
        System.out.println(""); 
        System.out.println("");
    }
}

