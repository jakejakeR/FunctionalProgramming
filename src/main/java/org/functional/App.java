package org.functional;

import org.functional.myfunctions.MyConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("App");
        logger.info("Hello World Functional Programming!");

        MyConsumer<String> myConsumerEcho = a -> logger.info(a);
        myConsumerEcho.apply("I am a consumer!");

    }
}