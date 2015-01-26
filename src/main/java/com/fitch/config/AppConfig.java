package com.fitch.config;

/**
 * Created by mteng on 1/25/2015.
 */
import com.fitch.beans.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
    @Bean(name = "addingAge")
    public AddingAge addingAge(){
        return new AddingAgeImpl();
    }
    @Bean(name = "randomEmailGenerator")
    public RandomEmailGenerator randomEmailGenerator(){
        return new RandomEmailGeneratorImpl();
    }
}
