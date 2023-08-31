public class EqualsSeventeen {

  public static void main(String[] args) {
    
    int result = 0;
      System.out.println();
       for (int i = 0; i < 5; i++){
            if (i == 3) { 
                result += 10;
            } 
            else {
                result += i;
            }	
        }
    System.out.println(result);
    System.out.println(); 

    int answer = 0;
      System.out.println();
        for (int j = 0; j < 5; j++){
            if( j == 3){
                answer += 10;
            }
            else{
                answer += j;
            }
        } 
    System.out.println(answer);
  }
}
// 0, 1, 2, 3, 4
//    1, 2, 13
//            =17