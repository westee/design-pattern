package factory;

import java.math.BigDecimal;

public class CouponStrategy implements PaymentStrategy{
    @Override
    public BigDecimal calculateTotalPrice(BigDecimal price) {
        // price减去10
        return price.subtract(new BigDecimal(10));
    }
}
