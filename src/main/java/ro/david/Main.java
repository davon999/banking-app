package ro.david;

import java.math.BigDecimal;

public class Main {
    static void main() {
    Account cont= new Account("id","212","dav",Currency.EUR);
    cont.deposit(new BigDecimal("150.50"));
        cont.withdraw(new BigDecimal("150.50"));
        BigDecimal balance = cont.getBalance();
        System.out.println(balance);

    }
}
