package chaining;

import java.math.BigDecimal;

public class DiscountStrategy extends AbstractPaymentStrategy {
    @Override
    boolean canProcess(PaymentContext c) {
        return c.getStrategyType().equals(StrategyType.DISCOUNT.name());
    }

    @Override
    BigDecimal doCalculateTotalPrice(PaymentContext c) {
        return c.getTotalPrice().multiply(new BigDecimal("0.9"));
    }
}
