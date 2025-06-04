package logging.extensions;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import java.util.Arrays;
import java.util.List;
import java.util.logging.*;
import java.util.regex.Pattern;

public class FilterHandler extends Handler {
    private final List<String> bannedWords = Arrays.asList(
        "switch-statements", "goto", "eval" // podés agregar más
    );

    private final Handler wrappedHandler;

    public FilterHandler(Handler wrappedHandler) {
        this.wrappedHandler = wrappedHandler;
    }

    @Override
    public void publish(LogRecord record) {
        if (!isLoggable(record)) return;

        String message = record.getMessage();

        for (String word : bannedWords) {
            message = message.replaceAll("(?i)\\b" + Pattern.quote(word) + "\\b", "***");
        }

        LogRecord filteredRecord = new LogRecord(record.getLevel(), message);
        filteredRecord.setMillis(record.getMillis());
        filteredRecord.setLoggerName(record.getLoggerName());
        filteredRecord.setSourceClassName(record.getSourceClassName());
        filteredRecord.setSourceMethodName(record.getSourceMethodName());
        filteredRecord.setThrown(record.getThrown());

        wrappedHandler.publish(filteredRecord);
    }

    @Override
    public void flush() {
        wrappedHandler.flush();
    }

    @Override
    public void close() throws SecurityException {
        wrappedHandler.close();
    }
}
