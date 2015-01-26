package com.fitch.beans;

import org.springframework.stereotype.Service;

/**
 * Created by mteng on 1/25/2015.
 */
@Service
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void printHelloWorld(String msg) {
        System.out.println("Hello : " + msg);
    }
}
