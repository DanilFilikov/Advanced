package org.example.StringTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Сollection {

    public static Set<Integer> set = new HashSet<>();

    public static Set getCollection(ArrayList<Integer> array) {
        System.out.println("\nВозвращает коллекцию уже без дубликатов");
        System.out.println("Исходный массив " + array);
        set.addAll(array);
        return set;
    }
}