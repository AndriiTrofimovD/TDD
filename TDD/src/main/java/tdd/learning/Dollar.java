package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }

}
