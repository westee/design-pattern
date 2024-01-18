import factory.DumplingFoodFactory;
import product.FoodProduct;

public class Main {
    public static void main(String[] args) {
        // 当需要一种新的食品-即需求时，
        // 需要先实现一个XXXFoodFactory和XXXFoodProduct,分别实现FoodFactory和FoodProduct
        DumplingFoodFactory pizzaFoodFactory = new DumplingFoodFactory(); // new PizzaFoodFactory();
        FoodProduct food = pizzaFoodFactory.getFood();
        System.out.println(food.getFoodProduct());
    }
}
