package com.zqxsober.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogTool {
    private static final Logger LOG = LoggerFactory.getLogger(LogTool.class);

    public static void info(String msg,Object object){
        LOG.info(msg+object.toString());
    }

    public static void error(String msg,Object object){
        LOG.error(msg+object.toString());
    }
}
