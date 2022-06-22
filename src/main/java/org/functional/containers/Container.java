package org.functional.containers;

import org.functional.myfunctions.MyFirstFunction;

public class Container<T> {

    private final T value;

    public Container(T value) {
        this.value = value;
    }

    /**
     * "Swaps" type T to type U.
     * @param mapper
     * @return
     * @param <U>
     */
    public <U> Container<U> map(MyFirstFunction<T, U> mapper) {
        return new Container<>(mapper.apply(value));
    }

    /**
     * "Swaps" type T to Container of type U
     * @param mapper
     * @return
     * @param <U>
     */
    public <U> Container<U> flatMap(MyFirstFunction<T, Container<U>> mapper) {
        return mapper.apply(value);
    }

    public T getValue() {
        return value;
    }
}
