package pl.koziolekweb;

import java.io.File;

public interface TodConverter {

	public void convert(File todFile) throws TodConversionException;

}
