package com.bj.basic;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by JACKSON on 2017/8/26.
 */

public class GiveLog {
    private static Logger logger = Logger.getLogger(GiveLog.class);

    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.TRACE);

        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
    }
}
