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

import java.io.File;

import pl.koziolekweb.TodConverter;
import pl.koziolekweb.TodMpegConverter;

public class ConvertOneStrategy implements ConversionStrategy {

	private File todFile;

	private TodConverter todMpegConverter;

	public ConvertOneStrategy(String value) {
		this.todFile = new File(value);
		this.todMpegConverter = new TodMpegConverter();
	}

	@Override
	public void apply() {
		todMpegConverter.convert(todFile);
	}

}
