package org.example;

import java.io.IOException;
import java.util.logging.*;

public class Log {
    Logger logger = Logger.getLogger(App.class.getName());

    public void log() {

        FileHandler fh;

        try {
            fh = new FileHandler("log_animal.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setLevel(Level.CONFIG);
        logger.setUseParentHandlers(false);
    }

    public void setLogger(String message) {
        logger.info(message);
    }


}
