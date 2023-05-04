package org.example.StringTasks;

public class StringCompressing {

    public static String compressBad(String str) {
        System.out.println("\nСжатие строки на основе счетчика повторяющихся символов");
        System.out.println("Исходная строка " + str);
        StringBuilder str2 = new StringBuilder();
        char last = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                str2.append(last).append(count);
                count = 1;
                last = str.charAt(i);
            }
        }
        if (str.length() < str2.length()) {
            return str;
        } else {
            return str2.toString();
        }
    }
}