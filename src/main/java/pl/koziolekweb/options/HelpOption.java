package pl.koziolekweb.options;

import static java.lang.System.out;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;

import pl.koziolekweb.strategies.ConversionStrategy;

public class HelpOption extends TodConverterOption {

	private static final long serialVersionUID = 1L;
	private HelpFormatter formatter;
	private Options options;

	public HelpOption(Options options) {
		super("h", "help", false, "Show help");
		setRequired(false);
		formatter = new HelpFormatter();
		this.options = options;
	}

	@Override
	public ConversionStrategy strategy() {
		return new ConversionStrategy() {
			public void apply() {
				formatter.printHelp("tod2mpg converter", options);
				/*
				 * out.println("tod2mpg converter\n\n");
				 * out.println("Create mpg file from TOD (JVC format) file.\n\n"
				 * ); out.println("SYNOPSIS:");
				 * out.println("java -jar tod2mpg.jar [todfile][-all][-h]\n\n");
				 * out.println("DESCRITPION:");
				 * out.println("todfile\t\t- path to TOD file"); out.println(
				 * "-all   \t\t- path search all TOD files in curent folder and convert."
				 * ); out.println("-h     \t\t- show help");
				 */System.exit(0);
			}
		};
	}
}
