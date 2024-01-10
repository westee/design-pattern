package chaining;

import java.math.BigDecimal;

public class VipStrategy extends AbstractPaymentStrategy {
    @Override
    boolean canProcess(PaymentContext c) {
        return c.getStrategyType().equals(StrategyType.VIP.name());
    }

    @Override
    BigDecimal doCalculateTotalPrice(PaymentContext c) {
        return c.getRawPrice().multiply(new BigDecimal("0.8"));
    }
}
