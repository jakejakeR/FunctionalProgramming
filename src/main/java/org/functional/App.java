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

        MyFirstFunction<String, Integer> myFunction1 = s -> s.length();
        Integer x = myFunction1.apply("Lambda used.");
        logger.info(x.toString());

        MyFirstFunction<String, String> myFunction2 = s -> s.concat(" No it's not haha!");
        String y = myFunction2.apply("Programming is easy!");
        logger.info(y);

        MyFirstFunction<Double, Boolean> myFunction3 = aDouble -> aDouble / 4 > 1;
        Boolean z = myFunction3.apply(4.1);
        logger.info(z.toString());
    }
}