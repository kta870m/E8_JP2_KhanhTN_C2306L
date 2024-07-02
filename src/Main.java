import Entity.Account;
import Service.AccountService;
import Service.DepositThread;
import Service.WithdrawThread;

import java.io.IOError;

public class Main {
    public static void main(String[] args){
        Account acc = new Account("001", 100);
        double amount = 15;
        WithdrawThread wd = new WithdrawThread(acc, amount);
        amount = 5;
        DepositThread dp = new DepositThread(acc, amount);
        Thread t1 = new Thread(wd);
        Thread t2 = new Thread(dp);
        try{
            t1.start();
            t1.join();
            t2.start();
        }catch (IOError | InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(t1.getState());
        System.out.println(t2.getState());

        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(dp.toString(":="));

    }
}