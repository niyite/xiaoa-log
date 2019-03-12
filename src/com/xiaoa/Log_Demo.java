package com.xiaoa;

import org.apache.log4j.Logger;

/**
 * @ClassName Log_Demo
 * @Description TODO
 * @Author wanmeng
 * @Date 2019/3/12 13:06
 * @Version 1.0
 **/
public class Log_Demo {

    private static Logger logger = Logger.getLogger(Log_Demo.class);

    /**
     * @param args
     */
    public static void main(String[] args) {

        // System.out.println("This is println message.");

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }
}
