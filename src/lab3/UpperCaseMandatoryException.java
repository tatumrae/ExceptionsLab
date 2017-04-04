package lab3;

/**
 *
 * @author Tatum Thomas
 */
public class UpperCaseMandatoryException extends IllegalArgumentException{
    
    private static final String MSG = "Input must be uppercase"; 

    public UpperCaseMandatoryException() {
        super(MSG);
    }

    public UpperCaseMandatoryException(String s) {
        super(MSG);
    }

    public UpperCaseMandatoryException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public UpperCaseMandatoryException(Throwable cause) {
        super(cause);
    }

}
