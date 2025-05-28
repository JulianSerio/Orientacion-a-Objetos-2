package logging.extensions;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;


public class UpperCaseFormater extends SimpleFormatter{

	@Override
    public String format(LogRecord record) {
        return super.format(record).toUpperCase();
	}
}
