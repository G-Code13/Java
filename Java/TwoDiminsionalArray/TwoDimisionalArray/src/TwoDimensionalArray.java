public class TwoDimensionalArray {

   
    public static void main(String[] args) {
      
        int [][] table = new int [5][3];
            
            table [0][0] = 1;
            table [0][1] = 1;
            table [0][2] = 1;
            
            table [1][0] = 1;
            table [1][1] = 1;
            table [1][2] = 1;
            
            table [2][0] = 1;
            table [2][1] = 1;
            table [2][2] = 1;
            
            table [3][0] = 1;
            table [3][1] = 1;
            table [3][2] = 1;
            
            table [4][0] = 1;
            table [4][1] = 1;
            table [4][2] = 1;
         
        int sum = 0;   
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                    sum += table [i][j];
              
              //  System.out.printf("%4d", +table[i][j]);          
            }
              
                System.out.printf("%4d", sum);  
        } 
        System.out.println();
    }
}
