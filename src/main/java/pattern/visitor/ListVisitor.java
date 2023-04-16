package pattern.visitor;


import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:Visitor类的子类，显示文件和文件夹的一览
 * User: xinyu
 * Date: 2023-04-16
 * Time: 9:56
 */
public class ListVisitor extends Visitor {
    private String currentdir="";//当前访问的文件夹的名字
    @Override
    public void visit(File file) {//在访问文件时被调用
        System.out.println(currentdir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {//在访问文件夹时被调用
        System.out.println(currentdir+"/"+directory);
        String savedir=currentdir;
        currentdir=currentdir+"/"+directory.getName();
        Iterator it= directory.iterator();
        while (it.hasNext()){
            Entry entry=(Entry) it.next();
            entry.accept(this);
        }
        currentdir=savedir;
    }
}
