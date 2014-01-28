package digvijag.evaluator.lib;

public class Exponent implements Operation {
    @Override
    public double perform(Expression left, Expression right) {
        return Math.pow(left.evaluate(), right.evaluate());
    }
}
