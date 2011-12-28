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

import org.apache.commons.cli.Option;

import pl.koziolekweb.strategies.ConversionStrategy;

public abstract class TodConverterOption extends Option {

	private static final long serialVersionUID = -3333909258809179699L;

	public TodConverterOption(String opt, boolean hasArg, String description)
			throws IllegalArgumentException {
		super(opt, hasArg, description);
	}

	public TodConverterOption(String opt, String longOpt, boolean hasArg,
			String description) throws IllegalArgumentException {
		super(opt, longOpt, hasArg, description);
	}

	public TodConverterOption(String opt, String description)
			throws IllegalArgumentException {
		super(opt, description);
	}

	public abstract ConversionStrategy strategy();
}
