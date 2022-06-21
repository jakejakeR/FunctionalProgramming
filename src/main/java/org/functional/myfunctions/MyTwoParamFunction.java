package org.functional.myfunctions;

/**
 * Functional interface with two parameters.
 * @param <T> input type.
 * @param <R> input type.
 * @param <Z> output type.
 */
@FunctionalInterface
public interface MyTwoParamFunction<T, R, Z> {

    Z apply(T t, R r);
}
