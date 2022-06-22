package org.functional;

import org.functional.myfunctions.MyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("App");

        MyFilter<String> stringFilter = s -> s.length() % 2 == 0;
        Boolean isEven = stringFilter.test("Cats");

        logger.info(isEven.toString());

    }
}