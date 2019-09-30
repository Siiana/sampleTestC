import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */
public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testMultiplyTwoValues() {
        assertEquals("10 * 5 must be 50", 50, calc.multiply(10, 5));
    }

    @Test
    public void testDivisionTwoValues() {
        assertEquals("10 / 5 must be 2", 2, calc.division(10, 5));
    }

    @Test
    public void testNegativeDivisionValue() {
        String message = "";
        try {
            calc.division(10, 0);
        } catch (ArithmeticException e) {
            message = e.getMessage();
        }
        assertEquals("10 / 0 must be ", "/ by zero", message);
    }

    @Test
    public void testSubtractionTwoValues() {
        assertEquals("10 - 5 must be 5", 5, calc.subtraction(10, 5));
    }

    @Test
    public void testSquareRootValue() {
        assertEquals("4 must be 2", (double) 2, calc.squareRoot(4));
    }

    @Test
    public void testNegativeSquareRootValue() {
        double result = calc.squareRoot(-1);
            assertEquals("Error",NaN, result);
    }


    @Test
    public void testPow2Value() {
        assertEquals("2 must be 4", 4d, calc.pow2(2, 2));
    }

    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
