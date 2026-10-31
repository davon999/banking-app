package ro.david;

import java.math.BigDecimal;

public class Main {
    static void main() {
        Bank bank = new Bank();

        Account david = bank.openAccount("David", Currency.EUR);

        System.out.println("Cont David: " + david.getIban() + " | id: " + david.getId() + " | " + david.getCurrency());

        david.deposit(new BigDecimal("100.00"));
        System.out.println("Sold dupa depunere: " + david.getBalance());

        david.withdraw(new BigDecimal("30.50"));
        System.out.println("Sold dupa retragere: " + david.getBalance());

        try {
            david.withdraw(new BigDecimal("500"));
        } catch (Exception e) {
            System.out.println("Eroare asteptata: " + e.getMessage());
        }

        try {
            david.deposit(new BigDecimal("-10"));
        } catch (Exception e) {
            System.out.println("Eroare asteptata: " + e.getMessage());
        }

        try {
            david.deposit(null);
        } catch (Exception e) {
            System.out.println("Eroare asteptata: " + e.getMessage());
        }

        System.out.println("Sold final: " + david.getBalance());
    }
    }
