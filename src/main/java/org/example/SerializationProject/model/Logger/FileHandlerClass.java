package org.example.SerializationProject.model.Logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class FileHandlerClass {

    static void getFileHandler(){
        try{
            FileHandler fileHandler = new FileHandler("src/main/resources/logFile.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new FormatterClass());
            LoggerClass.logger.addHandler(fileHandler);
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
