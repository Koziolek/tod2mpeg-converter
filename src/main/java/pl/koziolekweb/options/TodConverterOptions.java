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

import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;

public class TodConverterOptions extends Options {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4073792257425043163L;

	public TodConverterOptions() {
		OptionGroup optionGroup = new OptionGroup();
		optionGroup.addOption(new HelpOption(this));
		optionGroup.addOption(new ConvertAllOption());
		optionGroup.addOption(new ConvertOneOption());
		optionGroup.setRequired(true);
		addOptionGroup(optionGroup);
	}
}
