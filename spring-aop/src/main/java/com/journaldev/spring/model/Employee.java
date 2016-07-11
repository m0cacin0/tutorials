package com.journaldev.spring.model;

import com.journaldev.spring.aspect.Loggable;

import java.util.Arrays;
import java.util.List;

public class Employee {

    private String name;

    public String getName() {
        return name;
    }


    public void setName(String nm) {
        this.name = nm;
    }

    public void throwException() {
        throw new RuntimeException("Dummy Exception");
    }

    @Loggable
    public List<Long> showNumbers(String key, String value) {

        return Arrays.asList(1L, 2L, 3L, 4L);
    }
}
