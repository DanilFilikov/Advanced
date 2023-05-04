package org.example.StringTasks;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Iterator {

    public static Set<Integer> set = new HashSet<>();

    public static void getIterator() {
        System.out.println("\nИтератор по массиву");
        for (Integer set : set
        ) {
            System.out.println(set);
        }
    }
}