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

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class TodMpegConverter implements TodConverter {

	@Override
	public void convert(File todFile) throws TodConversionException {
		try {
			FileUtils.copyFile(todFile,
					new File(FilenameUtils.getBaseName(todFile.getName())
							+ ".mpg"));
		} catch (IOException e) {
			throw new TodConversionException(e);
		}
	}
}
