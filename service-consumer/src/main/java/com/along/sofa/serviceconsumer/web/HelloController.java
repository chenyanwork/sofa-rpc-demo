package com.along.sofa.serviceconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.along.sofa.HelloSyncService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-06 17:51
 */
@Controller
public class HelloController {

    @Autowired
    private HelloSyncService helloSyncServiceReference;

    @RequestMapping(path = "/hello")
    @ResponseBody
    public String sayHello(String msg) {
        return helloSyncServiceReference.saySync(msg);
    }
}
