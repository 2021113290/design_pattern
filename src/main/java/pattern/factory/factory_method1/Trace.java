package pattern.factory.factory_method1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-15
 * Time: 10:08
 */
public interface Trace {
    public void setDebug(boolean debug);
    public void debug(String message);
    public void error(String message);
}
