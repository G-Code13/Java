public class Grades {
    
    public char getLetterGrade(int points){
        if(points < 0){
            throw new IllegalArgumentException("Points has to be more than zero");
        }
        else if(points < 60){
            return 'F';
        }
        else if(points < 70){
            return 'D';
        }
        else if(points < 80){
            return 'C';
        }
        else if(points < 90){
            return 'B';
        }
        else 
            return 'A';
    }
}
