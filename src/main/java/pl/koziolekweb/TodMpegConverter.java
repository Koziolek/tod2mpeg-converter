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
