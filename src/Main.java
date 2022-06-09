import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int THREAD_POOLS = 3;//кол-во магазинов SHOP QUANTITY

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOLS);
        AccountService accountService = new AccountService();
        int min = 10;
        int max = 100;
        for (int i = 0; i < THREAD_POOLS; i++) {
            int numRandom = (int) (Math.random() * (max + 1 - min) + min);
            executorService.execute(() -> accountService.add(new Billing(numRandom)));
        }
        executorService.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println(accountService);
        executorService.shutdown();
    }
}
