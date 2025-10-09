import java.time.LocalDate

class Statement {

    private LocalDate date
    private Amount amount

    Statement(LocalDate date, Amount amount) {
        this.date = date
        this.amount = amount
    }

    Amount plus(Amount amount) {
        this.amount + amount
    }

    String toString() {
        "$date;$amount"
    }

}