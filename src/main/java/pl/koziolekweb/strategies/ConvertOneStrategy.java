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
