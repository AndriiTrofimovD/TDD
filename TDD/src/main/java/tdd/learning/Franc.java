package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
class Franc {
    private int amount;
    public Franc(int amount) {
        this.amount = amount;
    }
    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }
    public boolean equals(Object object){
        Franc that = (Franc) object;
        return this.amount == that.amount;
    }
}
