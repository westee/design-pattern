package chaining;

import java.math.BigDecimal;

public class MinusStrategy extends AbstractPaymentStrategy {
    @Override
    boolean canProcess(PaymentContext c) {
        return c.getRawPrice().compareTo(new BigDecimal(80)) >= 0;
    }

    @Override
    BigDecimal doCalculateTotalPrice(PaymentContext c) {
        return c.getTotalPrice().subtract(new BigDecimal("1"));
    }
}
