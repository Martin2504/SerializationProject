package org.example.SerializationProject.model.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class FormatterClass extends Formatter {
    @Override
    public String format(LogRecord record) {
        return LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE)
                + ": " + record.getSourceClassName()
                + ": " + record.getLevel()
                + ": " + record.getMessage()
                + "\n";
    }
}