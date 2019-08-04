package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

@SpringBootApplication
public class WebServiceClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceClientDemoApplication.class, args);
    }

}
