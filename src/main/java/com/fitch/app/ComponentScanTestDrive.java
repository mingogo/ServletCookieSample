package com.fitch.app;

import com.fitch.beans.HelloWorldImpl;
import com.fitch.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by mteng on 1/25/2015.
 */
@Component
public class ComponentScanTestDrive {

    @Autowired
    HelloWorldImpl helloWorldImpl;

    public void doMethod (){
        helloWorldImpl.printHelloWorld("mteng");
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ComponentScanTestDrive componentScanTestDrive = (ComponentScanTestDrive) context.getBean("componentScanTestDrive");
        componentScanTestDrive.doMethod();
    }
}
