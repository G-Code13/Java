import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        //Question 1
        Question question1 = new Question();
        question1.setText("Who was the inventor of Java?");
        question1.setAnswer("James Gosling");

        question1.display();
        System.out.print("Enter your answer here: ");
        String response = input.nextLine();
        //System.out.println(question1.checkAnswer(response));

        //Question 2
        Question question2 = new Question();
        question2.setAnswer("Greg Shannon");
        question2.setText("Who created this program?");

        question2.display();
        System.out.print("Enter you answer here: ");
        String response2 = input.nextLine();

        //Checking to see if answering are correct
        System.out.println();
        System.out.println(question1.checkAnswer(response));
        System.out.println(question2.checkAnswer(response2));
        input.close();

        ChoiceQuestion one = new ChoiceQuestion();
        one.setText("What year is it?");
        one.addChoice("2021", false);
        one.addChoice("2022", false);
        one.addChoice("2023", true);
        one.addChoice("2024", false);

        ChoiceQuestion two = new ChoiceQuestion();
        two.setText("What year were you born?");
        two.addChoice("1984", false);
        two.addChoice("1976", true);
        two.addChoice("1956", false);
        two.addChoice("1989", false);

        presentQuestion(one);
        presentQuestion(two);
    }

    public static void presentQuestion(ChoiceQuestion questions){
        
        Scanner input = new Scanner(System.in);

        questions.display();
        System.out.print("Enter your answer here: ");
        String response = input.nextLine();
        System.out.print(questions.checkAnswer(response));
        input.close();
    }
}
