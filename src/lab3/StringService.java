package lab3;

/**
 *
 * @author Tatum Thomas
 */
public class StringService {

    public void saveText(String text, int value) throws RuntimeException {

        if (value == 0) {
            throw new RuntimeException("value cannot be zero");
        }
        try {
            if (!text.equals(text.toUpperCase())) {
                throw new UpperCaseMandatoryException();
            }
            
        } catch (UpperCaseMandatoryException e) {
            throw new RuntimeException(e);
        }
    }
}
