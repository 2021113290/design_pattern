package pattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * Description:表示文件的类
 * User: xinyu
 * Date: 2023-04-15
 * Time: 16:42
 */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
