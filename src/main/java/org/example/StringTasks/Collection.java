package org.example.StringTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection {

    public static Set<Object> set = new HashSet<>();

    public static Set getCollection(Scanner in) {
        System.out.println("\nВозвращает коллекцию уже без дубликатов");
        System.out.println("Введите 10 чисел");
        ArrayList<Object> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(in.nextInt());
        }
        set.addAll(array);
        System.out.println("Исходный массив " + array);
        System.out.println("Получившийся массив");
        return set;
    }
}
