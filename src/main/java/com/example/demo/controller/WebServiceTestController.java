package com.example.demo.controller;

import com.example.demo.service.WebServiceTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * webservice测试控制器
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/8/4 12:40
 */
@RestController
public class WebServiceTestController {
    @Autowired
    WebServiceTestService webServiceTestService;

    @RequestMapping("test")
    public String test(String user) {
        return webServiceTestService.sayHello(user);
    }
}
