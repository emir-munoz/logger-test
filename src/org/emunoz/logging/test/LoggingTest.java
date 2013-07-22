package org.emunoz.logging.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * 
 * @author Emir Muñoz <emir@emunoz.org>
 * 
 */
public class LoggingTest
{
	static Logger	logger	= Logger.getLogger(LoggingTest.class);

	public static void main(String args[])
	{
		DOMConfigurator.configure("./conf/plainlog4jconfig.xml");

		logger.debug("Here is some DEBUG");
		logger.info("Here is some INFO");
		logger.warn("Here is some WARN");
		logger.error("Here is some ERROR");
		logger.fatal("Here is some FATAL");
	}
}
