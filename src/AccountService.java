import java.util.concurrent.atomic.AtomicLong;

public class AccountService {
    private int result;

    public AccountService(int sum) {
        this.result = sum;
    }

    AtomicLong atomicLong = new AtomicLong();

    @Override
    public String toString() {
        return "Total income: " + atomicLong.addAndGet(result);
    }
}
