package pl.koziolekweb.options;

import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;

public class TodConverterOptions extends Options {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4073792257425043163L;

	public TodConverterOptions() {
		OptionGroup optionGroup = new OptionGroup();
		optionGroup.addOption(new HelpOption(this));
		optionGroup.addOption(new ConvertAllOption());
		optionGroup.addOption(new ConvertOneOption());
		optionGroup.setRequired(true);
		addOptionGroup(optionGroup);
	}
}
