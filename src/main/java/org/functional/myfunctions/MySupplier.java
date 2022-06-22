package org.functional.myfunctions;

/**
 * Supplier/Producer
 */
@FunctionalInterface
public interface MySupplier<T> {

    T apply();
}
