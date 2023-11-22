public class Exceptions {
     
    static void exceptPalindrome(){
        System.out.println("You can't do that!!");
    }

    static boolean isAString(String s){
        if(s.equalsIgnoreCase("Y") || s.equalsIgnoreCase("N")){
            return true;
        }else{
            // Exceptions.exceptPalindrome();
            return false;
        }
    }
}
