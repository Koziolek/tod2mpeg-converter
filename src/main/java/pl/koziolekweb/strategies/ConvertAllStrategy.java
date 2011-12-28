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
