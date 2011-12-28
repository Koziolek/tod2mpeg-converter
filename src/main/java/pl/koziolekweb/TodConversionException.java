/*
 * #%L
 * tod2mpg-converter
 * %%
 * Copyright (C) 2011 null
 * %%
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE":
 * <bjkuczynski@gmail.com> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you could buy me a beer in return Bartek 'Koziołek' 
 * Kuczyński.
 * ----------------------------------------------------------------------------
 * #L%
 */
package pl.koziolekweb;

public class TodConversionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TodConversionException() {
		super();
	}

	public TodConversionException(String message) {
		super(message);
	}

	public TodConversionException(String message, Throwable cause) {
		super(message, cause);
	}

	public TodConversionException(Throwable cause) {
		super(cause);
	}

}
