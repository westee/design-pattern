package factory;

import java.math.BigDecimal;

public class VipStrategy implements PaymentStrategy {
    @Override
    public BigDecimal calculateTotalPrice(BigDecimal price) {
        return price.multiply(new BigDecimal("0.8"));
    }
}
