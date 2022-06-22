package org.functional.myfunctions;

/**
 * Equivalent of Consumer.
 * Consumer/Sink
 * @param <T>
 */
@FunctionalInterface
public interface MyConsumer<T> {

    void apply(T t);
}
