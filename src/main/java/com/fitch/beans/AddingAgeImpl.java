package com.fitch.beans;

import com.fitch.dto.Person;

/**
 * Created by mteng on 1/24/2015.
 */
public class AddingAgeImpl implements AddingAge {

    Person person = new Person();

    @Override
    public Integer AddingAgeMethod(Integer newAge){
        person.setName("mteng");
        person.setAge(30);
        return person.getAge();
    }
}
