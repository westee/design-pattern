package factory;

import product.CakeFoodProduct;
import product.FoodProduct;

public class CakeFoodFactory implements FoodFactory{
    @Override
    public FoodProduct getFood() {
        return new CakeFoodProduct();
    }
}
