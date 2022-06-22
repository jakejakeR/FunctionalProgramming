package org.functional.myfunctions;

/**
 * Equivalent of Predicate
 * @param <T>
 */
@FunctionalInterface
public interface MyFilter<T> {

    Boolean test(T t);
}
