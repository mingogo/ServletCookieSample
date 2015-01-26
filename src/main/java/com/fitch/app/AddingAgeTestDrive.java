package com.fitch.app;


import com.fitch.beans.AddingAge;
import com.fitch.beans.AddingAgeImpl;

/**
 * Created by mteng on 1/24/2015.
 */
public class AddingAgeTestDrive {

    public static void main (String argv[]){
        AddingAge addingAge = new AddingAgeImpl();
        Integer result = addingAge.AddingAgeMethod(50);
        System.out.println(result);
    }
}
