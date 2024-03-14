package access.b;

import access.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(20000);
        account.withdraw(3000);
        System.out.println(account.getBalance());

    }
}
