package pattern.factory.factory_method1;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-15
 * Time: 10:37
 */
public interface TraceFactory {
    public  Trace getTrace();
    void otherOperation();//也可以实现其他功能
}
