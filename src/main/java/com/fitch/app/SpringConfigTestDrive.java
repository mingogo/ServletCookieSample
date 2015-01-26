package com.fitch.app;

import com.fitch.config.AppConfig;
import com.fitch.beans.HelloWorldImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mteng on 1/25/2015.
 */
public class SpringConfigTestDrive {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorldImpl helloWorld = (HelloWorldImpl) context.getBean("helloBean");
        helloWorld.printHelloWorld("mteng");
    }
}
