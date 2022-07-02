package org.functional;

import org.functional.interfaces.MyParamValue;
import org.functional.interfaces.MyValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("App");
        logger.info("Hello");

        // lambda expression assigned to the simple functional interface reference
        MyValue myValue;
        myValue = () -> 98.6;
        System.out.println("A constant value: " + myValue.getValue() + "\r\n");

        // lambda expression assigned to the functional interface reference with parameter in method
        MyParamValue myPval;
        myPval = n -> 1.0 / n;
        System.out.println("Reciprocal of 4 is: " + myPval.getValue(4));
    }
}
