package org.functional;

import org.functional.myfunctions.MyFirstFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("App");
        logger.info("Hello World Functional Programming!");

        MyFirstFunction<String, Integer> myFirstFunction = new MyFirstFunction<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Integer x = myFirstFunction.apply("Maybe use lambda instead?");
        logger.info(x.toString());

        MyFirstFunction<String, Integer> mySecondFunction = s -> s.length();
        Integer y = mySecondFunction.apply("Lambda used.");
        logger.info(y.toString());

    }
}