package pattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * Description:表示数据结构的接口，它接受访问者的访问
 * User: xinyu
 * Date: 2023-04-16
 * Time: 9:56
 */
public interface Element {
    public abstract void accept(Visitor v);
}
