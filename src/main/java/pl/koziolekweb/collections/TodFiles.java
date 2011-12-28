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
