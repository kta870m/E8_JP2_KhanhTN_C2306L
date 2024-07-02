package Service;

import Entity.Account;

public class DepositThread extends AccountService implements Runnable{
    public DepositThread(Account acc, double amount) {
        super(acc, amount);
    }

    @Override
    public void run(){
        account.setBalance(account.getBalance() + amount);
    }
}
