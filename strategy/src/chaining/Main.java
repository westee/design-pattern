package chaining;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        NormalPaymentStrategy normalPaymentStrategy = new NormalPaymentStrategy();
        VipStrategy vipStrategy = new VipStrategy();
        DiscountStrategy discountStrategy = new DiscountStrategy();
        CouponStrategy couponStrategy = new CouponStrategy();
        MinusStrategy minusStrategy = new MinusStrategy();

        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setRawPrice(new BigDecimal(100));
        paymentContext.setStrategyType(StrategyType.VIP.name());
        // 使用Strategy的andThen方法
        PaymentContext context = normalPaymentStrategy
                .andThen(couponStrategy)
                .andThen(vipStrategy)
                .andThen(discountStrategy)
                .andThen(minusStrategy)
                .calculateTotalPrice(paymentContext);
        System.out.println(context.getTotalPrice());
    }
}