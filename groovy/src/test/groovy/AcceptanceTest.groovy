import org.junit.jupiter.api.Test

import static Amount.of
import static org.assertj.core.api.Assertions.assertThat;

class AcceptanceTest {

    @Test
    void printStatements_showsDateAmountBalance() {
        def account = new Account()
        account.deposit(of(500))
        account.withdraw(of(100))
        account.printStatements()
    }

    @Test
    void deposit_increasesBalance() {
        def account = new Account()
        account.deposit(of(500))
        assertThat(account.balance()).isEqualTo(of(500))
    }

    @Test
    void withdraw_decreasesBalance() {
        def account = new Account()
        account.withdraw(of(100))
        assertThat(account.balance()).isEqualTo(of(-100))
    }


}
