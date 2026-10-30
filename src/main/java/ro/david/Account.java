package ro.david;

public class Account {

    private double balance;
    private Currency currency;
    public Status status;
    public String id;
    public String iban;
    public String ownerName;

    enum Currency{
        RON,
        EUR,
        USD;
    }
    enum Status{
        active,
        blocked,
        closed;
    }
}
