/*
 * #%L
 * tod2mpg-converter
 * %%
 * Copyright (C) 2011 null
 * %%
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE":
 * <bjkuczynski@gmail.com> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you could buy me a beer in return Bartek 'Koziołek' 
 * Kuczyński.
 * ----------------------------------------------------------------------------
 * #L%
 */
package pl.koziolekweb;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

import pl.koziolekweb.options.TodConverterOption;
import pl.koziolekweb.options.TodConverterOptions;

/**
 * Create mpg file from TOD (JVC format) file. </br> </br> SYNOPSIS:</br> java
 * -jar tod2mpg.jar [-f todfile][-all][-h] </br> </br> DESCRITPION:</br>
 * <ul>
 * <li>-a,--all Convert all TOD files in current directory</li>
 * <li>-f,--file &lt;arg&gt; Path to TOD file</li>
 * <li>-h,--help Show help</li>
 * </ul>
 * 
 * @author koziolek
 */
public class Tod2Mpg {

	public static void main(String[] arguments) throws TodConversionException {
		CommandLineParser parser = new PosixParser();
		CommandLine commandLine;
		try {
			commandLine = parser.parse(new TodConverterOptions(), arguments);
			((TodConverterOption) (commandLine.getOptions()[0])).strategy()
					.apply();

		} catch (ParseException e) {
			throw new TodConversionException(e);
		}
	}
}
