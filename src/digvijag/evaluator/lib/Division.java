package digvijag.evaluator.lib;

public class Division implements Operation {
    @Override
    public double perform(Expression left, Expression right) {
        return left.evaluate() / right.evaluate();
    }
}
