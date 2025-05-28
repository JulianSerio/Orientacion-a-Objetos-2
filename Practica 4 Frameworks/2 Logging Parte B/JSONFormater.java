package logging.extensions;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

import org.json.simple.JSONObject;

public class JSONFormater extends SimpleFormatter{
	
	@Override
    public String format(LogRecord record) {
        JSONObject json = new JSONObject();
        json.put("level", record.getLevel().getName());
        json.put("loggerName", record.getLoggerName());
        json.put("message", record.getMessage());
        json.put("millis", record.getMillis());
        json.put("threadID", record.getThreadID());
        json.put("sourceClassName", record.getSourceClassName());
        json.put("sourceMethodName", record.getSourceMethodName());

        return json.toJSONString() + System.lineSeparator(); // Agrega salto de línea
    }
}
