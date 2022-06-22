package org.functional.myfunctions;

@FunctionalInterface
public interface MyFilter<T> {

    Boolean test(T t);
}
