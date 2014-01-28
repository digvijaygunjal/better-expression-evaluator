package digvijag.evaluator.lib;

public class Addition implements Operator {

    @Override
    public double evaluate(Expression left, Expression right) {
        return left.evaluate() + right.evaluate();
    }
}
