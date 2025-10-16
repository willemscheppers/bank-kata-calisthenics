package com.cegeka;

import java.time.LocalDate;

public class Statement {

    private final LocalDate date;
    private final Amount amount;

    Statement(LocalDate date, Amount amount) {
        this.date = date;
        this.amount = amount;
    }

    Amount plus(Amount amount) {
        return this.amount.plus(amount);
    }

    public String toString() {
        return date+";"+amount;
    }

}