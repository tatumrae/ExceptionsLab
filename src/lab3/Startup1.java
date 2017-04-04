package lab3;

/**
 *
 * @author Tatum Thomas
 */
public class Startup1 {
    public static void main(String[] args) {
        String s = "hello";
        StringService service = new StringService();
        
        try {
        service.saveText(s, 5);
        } catch(RuntimeException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
