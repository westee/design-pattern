package factory;

import java.math.BigDecimal;

public class DiscountStrategy implements PaymentStrategy {
    @Override
    public BigDecimal calculateTotalPrice(BigDecimal price) {
        return price.multiply(new BigDecimal("0.9"));
    }
}
