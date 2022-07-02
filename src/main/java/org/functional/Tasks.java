package org.functional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {

        List<Integer> numbersDivisibleBySix = IntStream.range(0, 101).boxed().filter(s -> s % 6 == 0).sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(numbersDivisibleBySix);
    }
}
