package org.functional;

import org.functional.containers.Container;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("App");

        Container<String> stringContainer = new Container<>("Hello!");

        Container<Integer> integerContainer = stringContainer.map(s -> s.length());

        logger.info(stringContainer.getValue() + " has " + integerContainer.getValue() + " chars.");

        Container<Integer> anotherIntegerContainer = integerContainer.map(s -> s + s);
        logger.info(anotherIntegerContainer.getValue().toString());

        Container<Boolean> booleanContainer = integerContainer.map(s -> s % 2 == 0);
        logger.info(booleanContainer.getValue().toString());

    }
}