package org.example.StringTasks;

import java.util.Scanner;

public class StringComparing {

    public static boolean compareString(Scanner in) {
        System.out.println("\nОпределяющий, является ли одна строка перестановкой другой");
        System.out.println("Введите две строки");
        String str = in.next();
        String str2 = in.next();
        System.out.println("Исходные строки " + str + " " + str2);
        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str.charAt(i) == str2.charAt(j)) {
                    resultStr.append(str.charAt(i));
                    break;
                }
            }
        }
        return str.contentEquals(resultStr);
    }
}
