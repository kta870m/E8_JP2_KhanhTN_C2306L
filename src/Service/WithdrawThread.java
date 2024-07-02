package Service;

import Entity.Account;

public class WithdrawThread extends AccountService implements Runnable{
    public WithdrawThread(Account ac, double amount){
        super(ac, amount);
    }
    @Override
    public void run() {
        super.withDraw();
    }

}
