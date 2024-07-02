package Service;

import Entity.Account;

public class AccountService {
    private Account account;
    private double amount;

    public AccountService(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }

    public Account withDraw(){
        account.setBalance(account.getBalance() - amount);
        return account;
    }

    public Account deposit(){
        account.setBalance(account.getBalance() + amount);
        return account;
    }

    public String toString(String separator){
        StringBuilder sb = new StringBuilder(separator);
        return sb
                .append(this.account.getId())
                .append(separator)
                .append(this.account.getBalance())
                .append(separator)
                .toString();

    }
}
