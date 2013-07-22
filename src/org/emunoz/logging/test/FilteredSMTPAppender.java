package org.emunoz.logging.test;

/**
 * 
 * @author Emir Muñoz <emir@emunoz.org>
 * 
 */
public class FilteredSMTPAppender extends BaseFilteredSMTPAppender
{
	@Override
	protected void sendBuffer()
	{
		cleanTimedoutExceptions();
		if (isSendMailAllowed())
		{
			super.sendBuffer();
			addException();
		}
	}
}
