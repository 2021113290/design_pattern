package pattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * Description:表示向文件中add时发生异常的类
 * User: xinyu
 * Date: 2023-04-15
 * Time: 16:54
 */
public class FileTreatmentException extends RuntimeException{
    public FileTreatmentException(){

    }
    public FileTreatmentException(String msg){
        super(msg);
    }
}
