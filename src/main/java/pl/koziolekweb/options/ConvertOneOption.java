package pl.koziolekweb.options;

import pl.koziolekweb.strategies.ConversionStrategy;
import pl.koziolekweb.strategies.ConvertOneStrategy;

public class ConvertOneOption extends TodConverterOption {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7338488558457469110L;

	public ConvertOneOption() {
		super("f", "file", true, "Path to TOD file");
	}

	@Override
	public ConversionStrategy strategy() {
		return new ConvertOneStrategy(getValue());
	}

}
