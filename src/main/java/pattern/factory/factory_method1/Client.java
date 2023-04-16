package pattern.factory.factory_method1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-15
 * Time: 10:45
 */
public class Client {
    public static void main(String[] args) {
        Trace log= new Factory1().getTrace();
        log.setDebug(true);
        log.debug("enter log");
        Trace trace=new SystemTrace();
    }
}
