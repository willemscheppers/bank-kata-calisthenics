package com.cegeka;

import java.util.ArrayList;
import java.util.List;

import static com.cegeka.Amount.ZERO;
import static java.time.LocalDate.now;

class Account {

    private final List<Statement> statements = new ArrayList<>();

    void deposit(Amount amount) {
        statements.add(new Statement(now(), amount));
    }

    void withdraw(Amount amount){
        statements.add(new Statement(now(), amount.negative()));
    }

    void printStatements() {
        System.out.println("Date;Amount;Balance");
        Amount balance = ZERO;
        for (Statement statement : statements) {
            balance = statement.plus(balance);
            System.out.println(statement+";"+balance);
        }
    }

    Amount balance() {
        Amount balance = ZERO;
        for (Statement statement : statements) {
            balance = statement.plus(balance);
        }
        return balance;
    }
}