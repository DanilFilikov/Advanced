package org.example.StringTasks;

import java.util.Arrays;

public class NumberOfTwo {

    public static int getNumberoftwo(int[] array) {
        System.out.println("\nПодсчитывает количество цифр «2», используемых в десятичной записи целых чисел от 0 до n (включительно)");
        System.out.println("Исходный массив " + Arrays.toString(array));
        int count = 0;
        for (int i = 0; i <= array.length; i++) {
            if ((i % 10 == 2) || (i / 10 == 2)) {
                count++;
            }
        }
        return count;
    }
}