package org.functional.containers;

import org.functional.myfunctions.MyFirstFunction;

public class Container<T> {

    private final T value;

    public Container(T value) {
        this.value = value;
    }

    /**
     * Returns new Container of type U.
     * Uses Functional interface that "swaps" type T to type U.
     */
    public <U> Container<U> map(MyFirstFunction<T, U> mapper) {
        return new Container<U>(mapper.apply(value));
    }

    public T getValue() {
        return value;
    }
}
