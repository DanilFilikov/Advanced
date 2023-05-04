package org.example.StringTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EqualPairs {

    public Set<Integer> set = new HashSet<>();

    public static int countCouple(Scanner in) {
        System.out.println("\nКоличество идентичных пар чисел");
        int count = 0;
        System.out.println("Введите размер массива и массив чисел");
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Исходный массив " + Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (array[i] == array[j] & i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}



