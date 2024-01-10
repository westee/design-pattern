package factory;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy strategy = StrategyFactory.getStrategy(StrategyType.VIP.name());
        BigDecimal bigDecimal = strategy.calculateTotalPrice(new BigDecimal(100));
        System.out.println(bigDecimal);
    }
}