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
}
