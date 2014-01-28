package digvijag.evaluator.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {

    @Test
    public void test_addition_of_two_expressions() {
        Expression expression = new Expression(new Expression(2D), new Expression(3D), new Addition());
        assertEquals(5.0, expression.evaluate());
    }

    @Test
    public void test_addition_of_Multiple_expressions() {
        Expression left = new Expression(new Expression(2D), new Expression(3D), new Addition());
        Expression expression = new Expression(left, new Expression(3D), new Addition());
        assertEquals(8.0, expression.evaluate());
    }

    @Test
    public void test_subtraction_of_two_expressions() {
        Expression expression = new Expression(new Expression(5), new Expression(2), new Subtraction());
        assertEquals(3.0, expression.evaluate());
    }

    @Test
    public void test_subtraction_of_Multiple_expressions() {
        Expression left = new Expression(new Expression(5), new Expression(3), new Subtraction());
        Expression expression = new Expression(left, new Expression(1), new Subtraction());
        assertEquals(1.0, expression.evaluate());
    }

    @Test
    public void test_multiplications_of_expressions() {
        Expression expression = new Expression(new Expression(2), new Expression(3), new Multiplication());
        assertEquals(6.0, expression.evaluate());
    }

    @Test
    public void test_division_of_expressions() {
        Expression expression = new Expression(new Expression(6), new Expression(3), new Division());
        assertEquals(2.0, expression.evaluate());
    }

    @Test
    public void test_all_operations_in_expressions() {
        Expression addition = new Expression(new Expression(2), new Expression(3), new Addition());
        Expression subtraction = new Expression(addition, new Expression(1), new Subtraction());
        Expression multiplication = new Expression(subtraction, new Expression(2), new Multiplication());
        Expression division = new Expression(multiplication, new Expression(2), new Division());
        assertEquals(4.0, division.evaluate());
    }

    @Test
    public void test_exponent_of_expressions() {
        Expression expression = new Expression(new Expression(2), new Expression(3), new Exponent());
        assertEquals(8.0, expression.evaluate());
    }
}
