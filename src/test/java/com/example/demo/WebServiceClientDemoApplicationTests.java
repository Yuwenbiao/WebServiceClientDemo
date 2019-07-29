package com.example.demo;

import mypackage.DemoServiceImplService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebServiceClientDemoApplicationTests {
    @Test
    public void contextLoads() {
        DemoServiceImplService webServiceImpl = new DemoServiceImplService();
        String result = webServiceImpl.getDemoServiceImplPort().sayHello("没有说");
        System.out.println("===========================================");
        System.out.println(result);
        System.out.println("===========================================");
    }
}
