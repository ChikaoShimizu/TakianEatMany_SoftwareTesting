import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GradeCalculatorTest {
    private GradeCalculator calc;
    
    @Before
    public void setUp() { calc = new GradeCalculator(); }

    @Test
    public void lowerBoundOfEachGrade() {
        assertEquals("A", calc.gradeOf(100));
        assertEquals("A", calc.gradeOf(80));
        assertEquals("B+", calc.gradeOf(75));
        assertEquals("B", calc.gradeOf(70));
        assertEquals("F", calc.gradeOf(49));
    }
    
    @Test(expected = IllegalArgumentException.class)
        public void scoreAboveHundredThrows() {
        calc.gradeOf(101);
    }
}
