package ar.com.lambdastuto.bankTransfer;

public interface AccountFactory {

    BankAccount getBankAccount(int id, double balance, String accountName);
}
