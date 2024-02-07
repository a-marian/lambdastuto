package ar.com.lambdastuto.bankTransfer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {

    public static void main(String[] args) {

        AccountFactory accountFactory = BankAccount::new;
        BankAccount studentAccount = accountFactory.getBankAccount(1, 5000, "Geronimo");
        BankAccount universityAccount = accountFactory.getBankAccount(2, 7000, "Antonio");
        BankAccount workerAccount = accountFactory.getBankAccount(3, 8000, "Ximena");

        BiPredicate<Double, Double> predicate = (balance, amount) -> balance > amount;

        BiConsumer<String, Double> printer = (x, y) -> System.out.println(x + y);

        BiConsumer<BankAccount, BankAccount> printAutomatic = (student, university)
                -> System.out.println("Ending balance of student account: "+ studentAccount.getBalance() +
                " University account: " + universityAccount.getBalance());

        ExecutorService service = Executors.newFixedThreadPool(10);
        Thread thread = new Thread (() -> {
            System.out.println(Thread.currentThread().getName() + " says :: Executing Transfer");
            try {
                double amount = 1000;
                if (!predicate.test(studentAccount.getBalance(), amount)) {
                    printer.accept(Thread.currentThread().getName() + " says :: balance insufficient", amount);
                    return;
                }
                while (!studentAccount.transfer(universityAccount, amount)){
                    TimeUnit.MILLISECONDS.sleep(100);
                    continue;
                }
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            printer.accept(Thread.currentThread().getName()+" says transfer is succesful: Balance in account ",
                    universityAccount.getBalance());
        });

        for (int i = 0; i < 20; i++) {
            service.submit(thread);
        }
        service.shutdown();

        try{
            while (!service.awaitTermination(24L, TimeUnit.HOURS)){
                System.out.println("Not yet, still waiting termination");
            }
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
     printAutomatic.accept(studentAccount, universityAccount);
    }

}
