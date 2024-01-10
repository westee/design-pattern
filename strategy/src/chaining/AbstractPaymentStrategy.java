package chaining;

import java.math.BigDecimal;

public abstract class AbstractPaymentStrategy implements PaymentStrategy {
    abstract boolean canProcess(PaymentContext c);
    abstract BigDecimal doCalculateTotalPrice(PaymentContext c);

    @Override
    public PaymentContext calculateTotalPrice(PaymentContext c) {
        if(canProcess(c)) {
            BigDecimal p = doCalculateTotalPrice(c);
            c.setTotalPrice(p);
            return c;
        }
        return c;
    }

}
