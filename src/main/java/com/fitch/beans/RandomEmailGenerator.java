package com.fitch.beans;

import org.springframework.stereotype.Service;

/**
 * Created by mteng on 1/25/2015.
 */
@Service
public interface RandomEmailGenerator {
    String generate();
}
