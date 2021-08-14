package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
class Franc extends Money{
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return currency;
    }
}
