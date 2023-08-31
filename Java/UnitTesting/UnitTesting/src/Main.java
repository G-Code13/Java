public class Main {
    public static void main(String[] args) throws Exception {
        
        Math easyProgram = new Math();

        System.out.println("This will add too: " + easyProgram.add(2, 2));
        System.out.println("This will subtract too: " + easyProgram.subtract(7, 2));
        System.out.println("This will multiply too: "+ easyProgram.multiply(3, 2));
        System.out.println("This will divide too: " + easyProgram.divide(2, 2));
        System.out.println(" ");

        Grades grade = new Grades();
    
        System.out.println("Your grade for this course is: " + grade.getLetterGrade(89));
    }
 }
