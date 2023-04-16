package pattern.factory.factory_method_static;

/**
 * @version v1.0
 * @ClassName: LatteCoffeeFactory
 * @Description: 拿铁咖啡工厂，专门用来生产拿铁咖啡
 * @Author: 黑马程序员
 */
public class LatteCoffeeFactory{

    public static Coffee createCoffee() {
        return new LatteCoffee();
    }
}
