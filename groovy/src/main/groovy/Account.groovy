import static Amount.ZERO
import static java.time.LocalDate.now

class Account {

    private List<Statement> statements = []

    void deposit(Amount amount) {
        statements.add(new Statement(now(), amount))
    }

    void withdraw(Amount amount){
        statements.add(new Statement(now(), -amount))
    }

    void printStatements() {
        println 'Date;Amount;Balance'
        Amount balance = ZERO
        for (def statement in statements) {
            balance = statement + balance
            println "$statement;$balance"
        }
    }

    Amount balance() {
        Amount balance = ZERO
        for (def statement in statements) {
            balance = statement + balance
        }
        return balance
    }
}