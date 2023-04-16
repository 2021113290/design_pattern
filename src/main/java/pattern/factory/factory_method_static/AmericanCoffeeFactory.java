package pattern.factory.factory_method_static;

/**
 * @version v1.0
 * @ClassName: AmericanCoffeeFactory
 * @Description: 美式咖啡工厂对象，专门用来生产美式咖啡
 * @Author: 黑马程序员
 */
public class AmericanCoffeeFactory {

    public static Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
