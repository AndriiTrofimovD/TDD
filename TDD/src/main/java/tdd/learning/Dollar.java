package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

}
