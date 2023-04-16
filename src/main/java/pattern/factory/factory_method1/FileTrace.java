package pattern.factory.factory_method1;

import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-15
 * Time: 10:09
 */
public class FileTrace implements Trace {
    private boolean debug;
    private PrintWriter pw;

    @Override
    public void setDebug(boolean debug) {
        this.debug=debug;
    }

    @Override
    public void debug(String message) {
        if(debug){
            pw.print("Debug:"+message);
            pw.flush();
        }
    }

    @Override
    public void error(String message) {
        pw.print("Error:"+message);
        pw.flush();
    }
}
