package org.example.StringTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfTwo {

    public static int getNumberoftwo(Scanner in) {
        System.out.println("\nПодсчитывает количество цифр «2», " +
                "используемых в десятичной записи целых чисел от 0 до n (включительно)");
        System.out.println("Введите кол-во чисел");
        ArrayList<Integer> array = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            array.add(i);
        }
        System.out.println("Исходный массив " + array);
        int count = 0;
        for (int i = 0; i <= array.size(); i++) {
            if ((i % 10 == 2) || (i / 10 == 2)) {
                if((i % 10 == 2) && (i / 10 == 2)){
                    count += 2;
                    continue;
                }
                count++;
            }
        }
        return count;
    }
}
