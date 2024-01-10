package chaining;

import java.util.Objects;

public interface PaymentStrategy {
    PaymentContext calculateTotalPrice(PaymentContext c);

    default PaymentStrategy andThen(PaymentStrategy after) {
        Objects.requireNonNull(after);
        return (PaymentContext c) -> after.calculateTotalPrice(calculateTotalPrice(c));
    }
}