package org.functional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("App");

        List<Integer> numbersDivisibleBySix = IntStream.range(0, 101).boxed().filter(s -> s % 6 == 0).collect(Collectors.toList());
        System.out.println(numbersDivisibleBySix);
    }
}
