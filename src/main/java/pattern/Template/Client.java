package pattern.Template;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-16
 * Time: 10:38
 */
public class Client {
    public static void main(String[] args) {
        AbstractDispaly d1=new CharDispaly('H');
        AbstractDispaly d2=new StringDispaly("Hello,world!");
        d1.display();
        d2.display();
    }
}
