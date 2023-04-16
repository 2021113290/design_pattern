package pattern.factory.factory_method_static;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
//        CoffeeStore store = new CoffeeStore();
        //创建对象
        //CoffeeFactory factory = new AmericanCoffeeFactory();
//        CoffeeFactory factory = new LatteCoffeeFactory();
//        store.setFactory(AmericanCoffeeFactory.createCoffee());

        //点咖啡
        Coffee coffee = AmericanCoffeeFactory.createCoffee();

        System.out.println(coffee.getName());
    }
}
