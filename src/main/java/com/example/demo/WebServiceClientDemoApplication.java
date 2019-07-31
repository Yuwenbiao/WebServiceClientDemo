package com.example.demo;

import com.example.demo.service.impl.DemoServiceImplServiceLocator;
import com.example.demo.service.impl.DemoServiceImplServiceSoapBindingStub;
import mypackage.DemoServiceImplService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

@SpringBootApplication
public class WebServiceClientDemoApplication {

    public static void main(String[] args) throws ServiceException, RemoteException {
        SpringApplication.run(WebServiceClientDemoApplication.class, args);
        DemoServiceImplServiceLocator demoServiceImplServiceLocator = new DemoServiceImplServiceLocator();
        DemoServiceImplServiceSoapBindingStub demoServiceImplService = (DemoServiceImplServiceSoapBindingStub) demoServiceImplServiceLocator.getDemoServiceImplPort();
        System.out.println("结果时：" + demoServiceImplService.sayHello("Tom，"));
    }

}
