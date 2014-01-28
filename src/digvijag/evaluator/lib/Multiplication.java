package digvijag.evaluator.lib;

public class Multiplication implements Operation {
    @Override
    public double perform(Expression left, Expression right) {
        return left.evaluate() * right.evaluate();
    }
}
