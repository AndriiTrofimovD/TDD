package tdd.learning;

/**
 * @author: Andrii Trofimov
 */
class Bank {
    Money reduce(Expression source, String to){
        if(source instanceof Money){
            return source.reduce(to);
        }
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
