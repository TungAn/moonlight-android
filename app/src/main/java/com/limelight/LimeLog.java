package com.limelight;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LimeLog {
    private static final boolean ENABLE_LOGGING = false;
    private static final Logger LOGGER = Logger.getLogger(LimeLog.class.getName());

    public static void info(String msg) {
        if (ENABLE_LOGGING) {
            LOGGER.info(msg);
        }
    }
    
    public static void warning(String msg) {
        if (ENABLE_LOGGING) {
            LOGGER.warning(msg);
        }
    }
    
    public static void severe(String msg) {
        if (ENABLE_LOGGING) {
            LOGGER.severe(msg);
        }
    }
    
    public static void setFileHandler(String fileName) throws IOException {
        if (ENABLE_LOGGING) {
            LOGGER.addHandler(new FileHandler(fileName));
        }
    }
}
