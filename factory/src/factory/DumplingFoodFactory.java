package factory;

import product.DumplingFoodProduct;
import product.FoodProduct;

public class DumplingFoodFactory implements FoodFactory{
    @Override
    public FoodProduct getFood() {
        return new DumplingFoodProduct();
    }
}
