package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount && this.currency.equals(money.currency);
    }

    public String toString(){
        return amount + " " + currency;
    }

    Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    String currency(){
        return currency;
    }
}
