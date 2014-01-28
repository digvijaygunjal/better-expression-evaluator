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
}
