package org.functional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("App");

        String x = "Hello";
        Optional<String> maybeX = Optional.ofNullable(x);
        logger.info(maybeX.toString());

        Optional<Integer> maybeInt = maybeX.map(s -> s.length());
        logger.info(maybeInt.toString());

    }
}