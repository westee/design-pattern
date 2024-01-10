package factory;

import java.util.HashMap;

public class StrategyFactory {
    private static final HashMap<String, PaymentStrategy> strategies = new HashMap<String, PaymentStrategy>(){
        {
            put(StrategyType.COUPON.name(), new CouponStrategy());
            put(StrategyType.VIP.name(), new VipStrategy());
            put(StrategyType.DISCOUNT.name(), new DiscountStrategy());
        }
    };

    public static PaymentStrategy getStrategy(String type){
        return strategies.get(type);
    }
}
