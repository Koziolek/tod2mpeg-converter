package pl.koziolekweb.options;

import org.apache.commons.cli.Option;

import pl.koziolekweb.strategies.ConversionStrategy;

public abstract class TodConverterOption extends Option {

	private static final long serialVersionUID = -3333909258809179699L;

	public TodConverterOption(String opt, boolean hasArg, String description)
			throws IllegalArgumentException {
		super(opt, hasArg, description);
	}

	public TodConverterOption(String opt, String longOpt, boolean hasArg,
			String description) throws IllegalArgumentException {
		super(opt, longOpt, hasArg, description);
	}

	public TodConverterOption(String opt, String description)
			throws IllegalArgumentException {
		super(opt, description);
	}

	public abstract ConversionStrategy strategy();
}
