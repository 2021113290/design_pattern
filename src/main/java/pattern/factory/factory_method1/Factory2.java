package pattern.factory.factory_method1;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-15
 * Time: 10:42
 */
public class Factory2 implements TraceFactory{
    @Override
    public Trace getTrace() {
        return new FileTrace();
    }

    @Override
    public void otherOperation() {

    }
}
