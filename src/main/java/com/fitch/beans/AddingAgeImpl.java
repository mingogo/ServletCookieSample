package com.fitch.beans;

import com.fitch.dto.Person;
import org.springframework.stereotype.Service;

/**
 * Created by mteng on 1/24/2015.
 */
@Service
public class AddingAgeImpl implements AddingAge {

    Person person = new Person();

    @Override
    public Integer AddingAgeMethod(Integer newAge){
        person.setName("mteng");
        person.setAge(30 + newAge);
        return person.getAge();
    }
}
