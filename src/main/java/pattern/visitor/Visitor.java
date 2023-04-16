package pattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * Description:表示访问者的抽象类，它访问文件和文件夹
 * User: xinyu
 * Date: 2023-04-16
 * Time: 9:55
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
