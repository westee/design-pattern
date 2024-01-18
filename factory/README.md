# 工厂方法
以吃肉夹馍为例，吃肉夹馍是紧密结合在一起的，如果将吃的行为和要吃的东西分开，吃是固定的，而吃什么不确定。

在这种场景下，就可以考虑使用工厂模式。

定义一个Factory，定义一个Product。

有新的“想吃的”就创建一个新的具体的XXXFactory和XXXProduct。

最后在要“吃”的时候，让这个工厂来生产指定产品就可以了，实际表现就是

定义一个用于创建对象的接口，让子类决定实例化哪一个具体类。

```java
public class Main {
    public static void main(String[] args) {
        // 在最后消费需求时，只更改这一行就可以了
        DumplingFoodFactory pizzaFoodFactory = new DumplingFoodFactory(); // new PizzaFoodFactory();
        FoodProduct food = pizzaFoodFactory.getFood();
        System.out.println(food.getFoodProduct());
    }
}
```

# 缺点
1. 需要重复实现Factory和Product，导致类的数量增加。
2. 类的数量的增多可能难以维护。
3. 增加新的Product产品需要修改抽象工厂和抽象产品提供的接口，同时客户端、其他的具体工厂和具体产品也需要进行修改，这违反了“开放封闭原则”。