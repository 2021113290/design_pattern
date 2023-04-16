package pattern.visitor;


import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:File类和Directory类的子类，他是抽象类
 * User: xinyu
 * Date: 2023-04-15
 * Time: 16:37
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry)throws FileTreatmentException {
        throw new FileTreatmentException();
    }
  public Iterator iterator()throws FileTreatmentException{
        throw new FileTreatmentException();
  }

    @Override
    public String toString() {
        return getName()+"("+getSize()+")";
    }
}
