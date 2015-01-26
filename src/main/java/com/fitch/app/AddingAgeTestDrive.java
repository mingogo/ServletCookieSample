package com.fitch.app;


import com.fitch.beans.AddingAge;

/**
 * Created by mteng on 1/24/2015.
 */
public class AddingAgeTestDrive {

    public static void main (String argv[]){
        AddingAge addingAge = new AddingAge();
        Integer result = addingAge.AddingAgeMethod(50);
        System.out.println(result);
    }
}
