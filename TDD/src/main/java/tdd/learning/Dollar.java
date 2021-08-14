package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }


    @Override
    String currency() {
        return currency;
    }

}
