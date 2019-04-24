package com.kgisl.task;

import java.util.Arrays;
import java.util.List;

public class CommaSep {

    public static void main(String[] args) {
        String commaSeparated = "item1 , item2 , item3";
        List<String> result = Arrays.asList(commaSeparated.split("\\s*,\\s*"));
        System.out.println(result);
    }

}