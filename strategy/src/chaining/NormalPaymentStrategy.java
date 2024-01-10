package chaining;

import java.math.BigDecimal;

public class NormalPaymentStrategy extends AbstractPaymentStrategy{

    @Override
    boolean canProcess(PaymentContext c) {
        return true;
    }

    @Override
    BigDecimal doCalculateTotalPrice(PaymentContext c) {
        return c.getRawPrice();
    }
}
