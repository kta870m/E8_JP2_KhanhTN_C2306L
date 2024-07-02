package Service;

import Entity.Account;

public abstract class AccountService {
    protected Account account;
    protected double amount;

    public AccountService(Account account, double amount){
        this.account = account;
        this.amount = amount;
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
