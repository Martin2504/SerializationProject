package org.example.SerializationProject.model.Logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class ConsoleClass {

    public static void runConsole(){
        ConsoleHandler consoleHandler = new ConsoleHandler();
        LoggerClass.logger.addHandler(consoleHandler);
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new FormatterClass());
    }
}
