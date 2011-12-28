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
package pl.koziolekweb.options;

import pl.koziolekweb.strategies.ConversionStrategy;
import pl.koziolekweb.strategies.ConvertAllStrategy;

public class ConvertAllOption extends TodConverterOption {

	private static final long serialVersionUID = 1L;

	public ConvertAllOption() {
		super("a", "all", false, "Convert all TOD files in current directory");
		setRequired(false);
	}

	@Override
	public ConversionStrategy strategy() {
		return new ConvertAllStrategy();
	}
}
