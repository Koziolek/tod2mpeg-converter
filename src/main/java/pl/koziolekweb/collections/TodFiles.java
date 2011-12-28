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
package pl.koziolekweb.collections;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

import pl.koziolekweb.TodConverter;

public class TodFiles {

	private Collection<File> tods;

	private TodFiles(Collection<File> tods) {
		this.tods = tods;
	}

	public static TodFiles fromCurrentDirectory() {
		return fromDirectory("./");
	}

	public static TodFiles fromDirectory(String directory) {
		String[] extensions = new String[] { "TOD", "tod", "Tod", "TOd", "tOd",
				"tOD", "toD" };
		return new TodFiles(FileUtils.listFiles(new File(directory),
				extensions, false));
	}

	public void convertAll(TodConverter todConverter) {
		for (File todFile : tods) {
			todConverter.convert(todFile);
		}
	}
}
