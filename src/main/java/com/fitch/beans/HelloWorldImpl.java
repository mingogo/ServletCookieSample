package com.fitch.beans;

/**
 * Created by mteng on 1/25/2015.
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void printHelloWorld(String msg) {
        System.out.println("Hello : " + msg);
    }
}
