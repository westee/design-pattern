package factory;


import product.FoodProduct;
import product.PizzaFoodProduct;

public class PizzaFoodFactory implements FoodFactory{
    @Override
    public FoodProduct getFood() {
        return new PizzaFoodProduct();
    }
}
