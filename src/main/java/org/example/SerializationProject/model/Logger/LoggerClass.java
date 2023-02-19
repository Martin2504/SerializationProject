package org.example.SerializationProject.model.Logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerClass {

    public final static Logger logger = Logger.getLogger(LoggerClass.class.getName());

    public static void createLog(String lvl, String msg){
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);

        switch (lvl) {
            case "ALL" -> logger.log(Level.ALL, msg);
            case "INFO" -> logger.log(Level.INFO, msg);
            case "CONFIG" -> logger.log(Level.CONFIG, msg);
            case "FINE" -> logger.log(Level.FINE, msg);
            case "FINER" -> logger.log(Level.FINER, msg);
            case "FINEST" -> logger.log(Level.FINEST, msg);
            case "WARNING" -> logger.log(Level.WARNING, msg);
            case "SEVERE" -> logger.log(Level.SEVERE, msg);
        }
    }
}
