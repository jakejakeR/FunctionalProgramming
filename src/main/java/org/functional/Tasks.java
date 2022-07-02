package org.functional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {

        List<Integer> numbersDivisibleBySix = IntStream.range(0, 101).boxed().filter(s -> s % 6 == 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(numbersDivisibleBySix);
    }
}
