import Entity.Account;
import Service.AccountService;
import Service.DepositThread;
import Service.WithdrawThread;

import java.io.IOError;

public class Main {
    public static void main(String[] args){
        Account acc = new Account("001", 100);
        double amount = 15;
        AccountService as = new AccountService(acc, amount);
        WithdrawThread wd = new WithdrawThread(acc, amount);
        amount = 5;
        DepositThread dp = new DepositThread(acc, amount);

        Thread t1 = new Thread(wd);
        Thread t2 = new Thread(dp);
        try{
            t1.start();
            t1.join(); //Thông báo cho t2 thực hiện đi vì t1 xong rồi!
            t2.start();
            t2.join();
        }catch(IOError | InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(dp.toString(":="));

    }
}