package com.zqxsober.config;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogTool {
    private static final Logger LOG = LoggerFactory.getLogger(LogTool.class);

    public static void info(String msg,Object object){
        LOG.info(msg+JSON.toJSONString(object));
    }
    public static void info(String msg){
        LOG.info(msg);
    }

    public static void error(String msg,Object object){
        LOG.error(msg+JSON.toJSONString(object));
    }
}
