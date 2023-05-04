package org.example.StringTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class EqualPairs {

    public Set<Integer> set = new HashSet<>();

    public static int countCouple(int[] array) {
        System.out.println("\nКоличество идентичных пар чисел");
        int count = 0;
        System.out.println("Исходный массив " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] == array[j] & i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}



