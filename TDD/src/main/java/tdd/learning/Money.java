package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
abstract class Money {
    protected int amount;

    static Money franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount && this.getClass() == money.getClass();
    }

    abstract Money times(int multiplier);

    static Money dollar(int amount){
        return new Dollar(amount);
    }
}
