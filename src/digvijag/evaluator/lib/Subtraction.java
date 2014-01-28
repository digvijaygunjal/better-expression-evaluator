package digvijag.evaluator.lib;

public class Subtraction implements Operation {
    @Override
    public double perform(Expression left, Expression right) {
        return left.evaluate() - right.evaluate();
    }
}
