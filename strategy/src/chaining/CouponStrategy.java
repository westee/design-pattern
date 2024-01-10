package chaining;

import java.math.BigDecimal;

public class CouponStrategy extends AbstractPaymentStrategy {
    @Override
    boolean canProcess(PaymentContext c) {
        return c.getStrategyType().equals(StrategyType.COUPON.name());
    }

    @Override
    BigDecimal doCalculateTotalPrice(PaymentContext c) {
        return  c.getRawPrice().subtract(new BigDecimal(10));
    }

}
