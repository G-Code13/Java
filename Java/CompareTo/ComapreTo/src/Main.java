public class Main {
    public static void main(String[] args) throws Exception {

        // String name1 = "claude";
        // // String name1 = "billy";
        // String name2 = "Billy";
        // // String name2 = "Theresa";
        // String name3 = "theresa";
        // // String name3 = "Claude";

        // // Using a compareTo with Ignore Case
        // if(name1.compareToIgnoreCase(name2) == 0){
        //     System.out.println("0");
        // }
        // else if(name1.compareToIgnoreCase(name2) < 0){
        //     System.out.println("1");
        // }
        // else{
        //     System.out.println("-1");
        // }

        // //  Using the equals with the Ignore Case
        // if(name3.equalsIgnoreCase(name1)){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }

        // creating an object and printing the instance variables
        Earth earth = new Earth();
            System.out.println(earth.getS1() + " " + earth.getS2() + " " + earth.getS3() + "!");

        // calling the compareTo method on the s1 and s2 variables
            System.out.println(earth.compareTo(earth));

        
    }
}
