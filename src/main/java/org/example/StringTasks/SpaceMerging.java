package org.example.StringTasks;

import java.util.Scanner;

public class SpaceMerging {

    public static String mergeSpace(Scanner in) {
        System.out.println("\nПреобразовать все идущие подряд пробелы в один");
        System.out.println("Введите строку");
        String str = in.nextLine();
        System.out.println("Исходная строка " + str);
        str = str.trim();
        str = str.replaceAll("\\s{2,}", " ");
        return str;
    }
}
