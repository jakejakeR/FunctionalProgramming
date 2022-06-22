package org.functional.myfunctions;

/**
 * Consumer/sink functional interface
 * @param <T>
 */
@FunctionalInterface
public interface MyConsumer<T> {

    void apply(T t);
}
