package com.example.demo.service.impl;

import com.example.demo.client.sayhello.DemoService;
import com.example.demo.service.WebServiceTestService;
import com.example.demo.client.sayhello.DemoServiceImplServiceLocator;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * JKLf
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/8/4 13:08
 */
@Service
public class WebServiceTestServiceImpl implements WebServiceTestService {
    private DemoService demoService;

    @Override
    public String sayHello(String user) {
        DemoServiceImplServiceLocator demoServiceImplServiceLocator = new DemoServiceImplServiceLocator();
        try {
            demoService = demoServiceImplServiceLocator.getDemoServiceImplPort();
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        try {
            return demoService.sayHello(user);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }
}
