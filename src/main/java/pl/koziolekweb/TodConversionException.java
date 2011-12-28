package pl.koziolekweb;

public class TodConversionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TodConversionException() {
		super();
	}

	public TodConversionException(String message, Throwable cause) {
		super(message, cause);
	}

	public TodConversionException(String message) {
		super(message);
	}

	public TodConversionException(Throwable cause) {
		super(cause);
	}

}
