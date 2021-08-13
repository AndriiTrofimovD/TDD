package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount && this.getClass() == money.getClass();
    }
}
