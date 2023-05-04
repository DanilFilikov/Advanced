package org.example.StringTasks;

public class SpaceMerging {

    public static String mergeSpace(String str) {
        System.out.println("\nПреобразовать все идущие подряд пробелы в один");
        System.out.println("Исходная строка " + str);
        str = str.trim();
        str = str.replaceAll("\\s{2,}", " ");
        return str;
    }
}