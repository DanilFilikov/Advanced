package org.example.StringTasks;

import java.util.List;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection {

    public static Set<Object> set = new HashSet<>();

    public static Set getCollection(List<Object> array) {
        System.out.println("\nВозвращает коллекцию уже без дубликатов");
        set.addAll(array);
        System.out.println("Исходный массив " + array);
        System.out.println("Получившийся массив");
        return set;
    }
}

