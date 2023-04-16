package pattern.factory.factory_method1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-15
 * Time: 10:39
 */
public class Factory1 implements TraceFactory{

    @Override
    public Trace getTrace() {
        return new SystemTrace();
    }

    @Override
    public void otherOperation() {

    }
}
