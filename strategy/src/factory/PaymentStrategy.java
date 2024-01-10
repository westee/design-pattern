package factory;

import java.math.BigDecimal;

public interface PaymentStrategy {
    BigDecimal calculateTotalPrice(BigDecimal price);
}