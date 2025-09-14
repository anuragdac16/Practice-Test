package com.app.anurag;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Praject {

    public static void main(String[] args) {

        String str = "I am doing an interview at ePAM I work for EPAM bla bla Bla" ;
        //show words with occurs more than once.

      Arrays.stream(str.split(" ")).map(m -> m.toLowerCase(Locale.US))
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
              .entrySet().stream().filter(entry -> entry.getValue() >1L)
              .forEach(k -> System.out.println(k.getKey() +" : "+ k.getValue() ));
              //.forEach(System.out::println);
              //.forEach((k, v) -> System.out.println(k +" : "+ v ));

    }
}
