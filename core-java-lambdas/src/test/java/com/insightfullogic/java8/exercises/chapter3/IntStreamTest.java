package com.insightfullogic.java8.exercises.chapter3;


import org.junit.Test;

import java.util.stream.IntStream;

public class IntStreamTest {

    @Test
    public void t1() {
        IntStream stream = IntStream.range(0, 10);
        stream.forEach(System.out::println);
    }
}
