package pattern.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:遍历集合的接口
 * User: xinyu
 * Date: 2023-04-15
 * Time: 15:46
 */
public interface Iterator {
    public abstract boolean hasNext();//判断是否存在下一个元素
    public abstract Object next();//返回当前所指向的书，并让迭代器指向下一本书
}
