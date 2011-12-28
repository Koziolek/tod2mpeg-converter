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
import pl.koziolekweb.strategies.ConvertOneStrategy;

public class ConvertOneOption extends TodConverterOption {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7338488558457469110L;

	public ConvertOneOption() {
		super("f", "file", true, "Path to TOD file");
	}

	@Override
	public ConversionStrategy strategy() {
		return new ConvertOneStrategy(getValue());
	}

}
