package pl.koziolekweb.options;

import pl.koziolekweb.strategies.ConversionStrategy;
import pl.koziolekweb.strategies.ConvertAllStrategy;

public class ConvertAllOption extends TodConverterOption {

	private static final long serialVersionUID = 1L;

	public ConvertAllOption() {
		super("a", "all", false, "Convert all TOD files in current directory");
		setRequired(false);
	}

	@Override
	public ConversionStrategy strategy() {
		return new ConvertAllStrategy();
	}
}
