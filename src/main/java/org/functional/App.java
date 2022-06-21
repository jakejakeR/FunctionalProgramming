package org.functional;

import org.functional.myfunctions.MyTwoParamFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("App");
        logger.info("Hello World Functional Programming!");

        MyTwoParamFunction<Integer, Integer, Integer> myFunction4 = (a, b) -> a + b;
        Integer x = myFunction4.apply(5,6);
        logger.info(x.toString());
    }
}