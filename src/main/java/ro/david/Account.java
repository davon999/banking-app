package ro.david;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;
    private final Currency currency;
    private AccountStatus status;
    private final String id;
    private final String iban;
    private final String ownerName;

    public enum AccountStatus {
        ACTIVE,
        BLOCKED,
        CLOSED;
    }

    public Account(String id, String iban, String ownerName, Currency currency) {
        this.id = id;
        this.iban = iban;
        this.ownerName = ownerName;
        this.currency = currency;
        this.balance = BigDecimal.ZERO;
        this.status = AccountStatus.ACTIVE;
    }
}
