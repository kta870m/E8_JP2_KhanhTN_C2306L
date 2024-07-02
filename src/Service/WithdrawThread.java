package Service;

import Entity.Account;

public class WithdrawThread extends AccountService implements Runnable{
    public WithdrawThread(Account acc, double amount){
        super(acc, amount);
    }

    @Override
    public void run() {
        account.setBalance(account.getBalance() - amount);
    }



}
