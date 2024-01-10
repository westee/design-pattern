package chaining;

import java.math.BigDecimal;

public class PaymentContext {
    private BigDecimal rawPrice;
    private String StrategyType;
    private BigDecimal totalPrice;

    public BigDecimal getRawPrice() {
        return rawPrice;
    }

    public void setRawPrice(BigDecimal rawPrice) {
        this.rawPrice = rawPrice;
    }

    public String getStrategyType() {
        return StrategyType;
    }

    public void setStrategyType(String strategyType) {
        StrategyType = strategyType;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
