package pattern.Template;

/**
 * Created with IntelliJ IDEA.
 * Description:只实现了dispaly方法的抽象类
 * User: xinyu
 * Date: 2023-04-16
 * Time: 10:27
 */
public abstract class AbstractDispaly {
    public abstract void open();//交给子类去实现的抽象方法
    public abstract void print();//
    public abstract void close();//
    public final void display(){
        open();//打开
        for (int i = 0; i < 5; i++) {
            print();//循环调用5次print()
        }
        close();//关闭
    }
}
