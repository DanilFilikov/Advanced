package org.example.StreamTask;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionsListof {

    public void addToString(List<String> list) {
        Stream<String> stream = list.stream();
        stream
        .map(x -> x + "_1")
        .forEach(System.out::println);
    }

    public void sortCollection(List<String> list) {
        Stream<String> stream = list.stream();
        stream
        .sorted()
        .forEach(System.out::println);
    }

    public void getArray(List<String> list){
        Stream<String> stream = list.stream();
        stream
        .map(x -> x.split("")[1])
        .forEach(System.out::println);
    }
    public void sortDeleteString(List<String> list){
        Stream<String> stream = list.stream();
        stream
        .sorted()
        .distinct()
        .forEach(System.out::println);
    }
}
