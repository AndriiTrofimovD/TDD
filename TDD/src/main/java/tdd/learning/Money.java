package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount && this.getClass() == money.getClass();
    }

    abstract Money times(int multiplier);

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    String currency(){
        return currency;
    }
}
