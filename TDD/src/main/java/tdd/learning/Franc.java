package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
class Franc extends Money{
    public Franc(int amount, String currency) {
        super(amount, currency);
    }
    Money times(int multiplier){
        return Money.franc(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
