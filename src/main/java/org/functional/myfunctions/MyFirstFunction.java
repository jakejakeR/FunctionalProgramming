package org.functional.myfunctions;

/**
 * Equivalent of Function.
 * Functional interface.
 * @param <T> input type.
 * @param <R> output type.
 */
@FunctionalInterface
public interface MyFirstFunction<T, R> {

    R apply(T t);
}
