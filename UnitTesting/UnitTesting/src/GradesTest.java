import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GradesTest {
    @Test
    void testZeroOrLess(){
        var grade = new Grades();
        assertThrows(IllegalArgumentException.class, () -> {
            grade.getLetterGrade(-1);
        });
    }
    @Test
    void testGetLetterGradeF() {
        Grades grade = new Grades();
        assertEquals('F', grade.getLetterGrade(59));
    }
    @Test
    void testGetLetterGradeD() {
        Grades grade = new Grades();
        assertEquals('D', grade.getLetterGrade(69));
    }
    @Test
    void testGetLetterGradeC(){
        var grade = new Grades();
        assertEquals('C', grade.getLetterGrade(79));
    }
    @Test
    void testGetLetterGradeB(){
        var grade = new Grades();
        assertEquals('B', grade.getLetterGrade(89));
    }
    @Test
    void testGetLetterGradeA(){
        var grade = new Grades();
        assertEquals('A', grade.getLetterGrade(90));
    }
}
