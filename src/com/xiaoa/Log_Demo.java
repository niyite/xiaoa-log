package com.xiaoa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Log_Demo
 * @Description 测试日志工具类
 * @Author wanmeng
 * @Date 2019/3/12 13:06
 * @Version 1.0
 **/
public class Log_Demo {

    //日志记录工具类
    private static Logger log = LoggerFactory.getLogger(Log_Demo.class);

    /**
     * @param args
     */
    public static void main(String[] args) {

        // 记录debug级别的信息
        log.debug("This is debug message.");
        // 记录info级别的信息
        log.info("This is info message.");
        // 记录error级别的信息
        log.error("This is error message.");
        // 用占位符记录日志
        log.debug("this is {} message", "debug");

    }
}
