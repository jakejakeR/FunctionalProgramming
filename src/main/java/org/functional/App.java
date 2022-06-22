package org.functional;

import org.functional.myfunctions.MySupplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("App");
        logger.info("Hello World Functional Programming!");

        MySupplier<String> mySupplier = () -> LocalDateTime.now().toString();
        logger.info(mySupplier.apply());

    }
}