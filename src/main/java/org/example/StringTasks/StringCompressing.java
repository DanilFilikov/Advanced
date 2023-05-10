package org.example.StringTasks;

import java.util.Scanner;

public class StringCompressing {

    public static String compressBad(Scanner in) {
        System.out.println("\nСжатие строки на основе счетчика повторяющихся символов");
        System.out.println("Введите строку");
        String str = in.next();
        System.out.println("Исходная строка " + str);
        StringBuilder str2 = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
            else {
                str2.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
            if (i == str.length() - 1){
                str2.append(str.charAt(i - 1)).append(count);
            }
        }
        if (str.length() < str2.length()) {
            return str;
        }
        else {
            return str2.toString();
        }
    }
}
