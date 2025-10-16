package com.cegeka;

import org.junit.jupiter.api.Test;

import static com.cegeka.Amount.of;
import static org.assertj.core.api.Assertions.assertThat;
public class AcceptanceTest {

    @Test
    void printStatements_showsDateAmountBalance() {
        Account account = new Account();
        account.deposit(of(500));
        account.withdraw(of(100));
        account.printStatements();
    }

    @Test
    void deposit_increasesBalance() {
        Account account = new Account();
        account.deposit(of(500));
        assertThat(account.balance()).isEqualTo(of(500));
    }

    @Test
    void withdraw_decreasesBalance() {
        Account account = new Account();
        account.withdraw(of(100));
        assertThat(account.balance()).isEqualTo(of(-100));
    }

}
