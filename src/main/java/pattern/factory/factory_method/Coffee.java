package pattern.factory.factory_method;

/**
 * @version v1.0
 * @ClassName: Coffee
 * @Description: 咖啡类
 * @Author: 黑马程序员
 */
public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addsugar() {
        System.out.println("加糖");
    }

    //加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
