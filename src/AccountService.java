import java.util.concurrent.atomic.LongAdder;

public class AccountService {


    LongAdder longAdder = new LongAdder();

    public void add(Billing billing) {
        longAdder.add(billing.getSum());
    }

    @Override
    public String toString() {
        return "Total income:" + longAdder.sum();
    }
}
