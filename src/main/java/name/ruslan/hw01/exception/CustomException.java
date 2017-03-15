package name.ruslan.hw01.exception;

/**
 * Created by Ruslan_Arifullin on 2/21/2017.
 * ??????????
 */
public class CustomException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }

}
