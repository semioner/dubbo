package com.semion.dubbo.provider.impl;

import com.semion.dubbo.provider.DemoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by heshuanxu on 2016/6/2.
 */
public class DemoServiceImpl implements DemoService {

    private final static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHI(String words) {
        logger.trace("服务端-----trace");
        logger.debug("服务端----debug");
        logger.info("服务端-----info");
        logger.warn("服务端------warn");
        logger.error("服务端-----error");
        logger.info("Client param：{"+ words +"}");
        return "hello "+words;
    }

    @Override
    public List getUsers() {
        logger.info("exec getUsers method .....");
        List list = new ArrayList();
        list.add("u1");
        list.add("u2");
        logger.info("getUsers method .....end");
        return list;
    }
}
