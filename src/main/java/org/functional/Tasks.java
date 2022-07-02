package org.functional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("App");

        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Jake");
        names.add("Juliet");
        names.add("Mathew");
        names.add("Jason");
        names.add("Brandon");
        names.add("Winnie");
        names.add("Rex");
        names.add("Dominic");

        List<String> sortedNames = names.stream().sorted(((o1, o2) -> o1.compareToIgnoreCase(o2))).collect(Collectors.toList());

        logger.info(sortedNames.toString());

    }
}
