package org.functional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("App");

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("br");
        strings.add("cqwe");
        strings.add("dasdfghj");

        List<Integer> integers = strings.stream().map(s -> s.length()).collect(Collectors.toList());
        logger.info(integers.toString());

        // using for...
        List<Integer> ints = new ArrayList<>();
        for (String string : strings) {
            ints.add(string.length());
        }
        logger.info(ints.toString());
    }
}