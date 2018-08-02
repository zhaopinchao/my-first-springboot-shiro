package com.zpc.shiro.utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author zhaopinchao
 * @date 2018-7-27 20:21
 */
public class AESUtilTest {

    private Logger logger = LoggerFactory.getLogger(AESUtilTest.class);

    @Test
    public void testAESEncodeAndDncode(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String password ="wq2saa";
        String content="123";
        logger.info("要加密的数据：{}",content);
        logger.info("加密开始时间：{}",simpleDateFormat.format(new Date()));
        String encode = AESUtil.AESEncode(password,content);
        logger.info("加密结束时间：{}",simpleDateFormat.format(new Date()));
        logger.info("加密后的数据：{}",encode);
        String dncode = AESUtil.AESDncode(password,encode);
        logger.info("解密结束时间：{}",simpleDateFormat.format(new Date()));
        logger.info("解密后的数据：{}",dncode);
    }

}