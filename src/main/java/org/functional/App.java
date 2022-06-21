package org.functional;

import org.functional.interfaces.MyValue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World Functional Programming!\r\n" );

        // lambda expression assigned to the simple functional interface reference
        MyValue myValue;
        myValue = () -> 98.6;
        System.out.println("A constant value: " + myValue.getValue());
    }
}
