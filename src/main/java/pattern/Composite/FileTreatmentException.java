package pattern.Composite;

/**
 * Created with IntelliJ IDEA.
 * Description:
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
