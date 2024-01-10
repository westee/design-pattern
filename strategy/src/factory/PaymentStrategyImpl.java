package factory;

import java.math.BigDecimal;

public class PaymentStrategyImpl implements PaymentStrategy {
    @Override
    public BigDecimal calculateTotalPrice(BigDecimal price) {
        return price;
    }
}
