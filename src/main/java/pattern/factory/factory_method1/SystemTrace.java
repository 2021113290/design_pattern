package pattern.factory.factory_method1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-15
 * Time: 10:32
 */
public class SystemTrace implements Trace {
    private boolean debug;
    @Override
    public void setDebug(boolean debug) {
        this.debug=debug;
    }

    @Override
    public void debug(String message) {
        if (debug){
            System.out.println("Debug:"+message);
        }
    }

    @Override
    public void error(String message) {
        System.out.println("Error:"+message);
    }
}
