package exception;

public class InvalidUserOrPassException extends RuntimeException {
	String message;

	public InvalidUserOrPassException(String message) {
		super();
		this.message = message;
	}
	
    @Override
    public String getMessage() {
    	return message;
    }
}
