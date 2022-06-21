package org.functional.myfunctions;

/**
 * Functional interface.
 * @param <T> input type.
 * @param <R> output type.
 */
@FunctionalInterface
public interface MyFirstFunction<T, R> {

    R apply(T t); // Example of implementing method: int apply(int t);
}
