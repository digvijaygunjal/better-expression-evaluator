package digvijag.evaluator.lib;

public class Expression {
    Double value;
    Expression left, right;
    Operation operator;

    Expression(Expression left, Expression right, Operation operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression(double value) {
        this.value = value;
    }

    double evaluate() {
        return (this.value != null) ? value : operator.perform(left, right);
    }
}
