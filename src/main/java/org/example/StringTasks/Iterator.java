package org.example.StringTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Iterator {

    public static void getIterator(Scanner in) {
        System.out.println("Введите 10 чисел");
        Set<Object> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(in.nextInt());
        }
        System.out.println("\nИтератор по массиву " + set);
        for (Object sets : set
        ) {
            System.out.println(sets);
        }
    }
}
