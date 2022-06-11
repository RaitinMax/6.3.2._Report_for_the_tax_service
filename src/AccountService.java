import java.util.concurrent.atomic.AtomicLong;

public class AccountService {
    private int result;

    public AccountService(int sum) {
        this.result = sum;
    }

    private AtomicLong atomicLong = new AtomicLong();


    public void setResult(int sum) {
        this.atomicLong.addAndGet(sum);
    }

    @Override
    public String toString() {
        return "Total income: " + atomicLong;
    }
}
