package org.functional.myfunctions;

/**
 * Consumer/Sink
 * @param <T>
 */
@FunctionalInterface
public interface MyConsumer<T> {

    void apply(T t);
}
