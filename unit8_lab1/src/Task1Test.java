import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {

    @Test
    public void testExceeds() {
        assertEquals("Exceeds", BuggyProgram.getGrade(90));
        assertEquals("Exceeds", BuggyProgram.getGrade(100));
    }

    @Test
    public void testMeets() {
        assertEquals("Meets", BuggyProgram.getGrade(80));
        assertEquals("Meets", BuggyProgram.getGrade(89));
    }

    @Test
    public void testDoesNotMeet() {
        assertEquals("Does Not Meet", BuggyProgram.getGrade(79));
        assertEquals("Does Not Meet", BuggyProgram.getGrade(0));
    }
}