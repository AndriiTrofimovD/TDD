package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}
