package com.along.sofa.serviceprovider.service;

import com.along.sofa.HelloSyncService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-06 17:39
 */
public class HelloSyncServiceImpl implements HelloSyncService {

    @Override
    public String saySync(String string) {
        return string;
    }
}
