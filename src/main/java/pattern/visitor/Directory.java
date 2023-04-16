package pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:表示文件夹的类
 * User: xinyu
 * Date: 2023-04-15
 * Time: 16:44
 */
public class Directory extends Entry {
    private  String name;
    private ArrayList directory=new ArrayList<>();


    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size=0;
        Iterator it= directory.iterator();
        while (it.hasNext()){
            Entry entry= (Entry) it.next();
            size+=entry.getSize();//size加上了entry的大小，但entry可能是File类的实例，也可能是Directory类的实例，无论是哪个类的实例，都可以通过getSize方法得到它的大小，
            // 这就是Composite模式的特征：容器与内容的一致性
        }
        return size;
    }
    public Entry add(Entry entry){
        directory.add(entry);//不判断加入的是Directory类还是File类，而是将“加入”的具体处理委派给了ArrayList类
        return this;
    }
    public Iterator iterator(){
        return directory.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
