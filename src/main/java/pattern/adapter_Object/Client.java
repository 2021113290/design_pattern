package pattern.adapter_Object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-16
 * Time: 12:12
 */
public class Client {
    public static void main(String[] args) {
        Print p=new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
