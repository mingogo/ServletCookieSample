package com.fitch.beans;

/**
 * Created by mteng on 1/25/2015.
 */
public class RandomEmailGeneratorImpl implements RandomEmailGenerator {
    @Override
    public String generate() {
        return "feedback@yoursite.com";
    }
}
