package org.functional.myfunctions;

/**
 * Equivalent of Supplier
 */
@FunctionalInterface
public interface MySupplier<T> {

    T get();
}
