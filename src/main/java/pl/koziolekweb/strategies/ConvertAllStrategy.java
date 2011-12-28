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
package pl.koziolekweb.strategies;

import pl.koziolekweb.TodMpegConverter;
import pl.koziolekweb.collections.TodFiles;

public class ConvertAllStrategy implements ConversionStrategy {

	@Override
	public void apply() {
		TodFiles.fromCurrentDirectory().convertAll(new TodMpegConverter());
		System.exit(0);
	}

}
