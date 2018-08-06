package com.along.sofa.services;

import com.along.sofa.HelloSyncService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-06 18:35
 */
public class HelloSyncServiceImpl implements HelloSyncService {
    @Override
    public String saySync(String msg) {
        System.out.println("Server receive: " + msg);
        return "hello " + msg + " ！";
    }
}
