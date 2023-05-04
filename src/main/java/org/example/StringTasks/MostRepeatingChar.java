package org.example.StringTasks;

import java.util.Scanner;

public class MostRepeatingChar {

    public static char getChar(Scanner in) {
        System.out.println("\nНайти первый наиболее часто повторяющийся в строке символ");
        System.out.println("Введите строку");
        String str = in.next();
        System.out.println("Исходная строка " + str);
        int globeCount = 0;
        int count = 1;
        char letter = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > globeCount) {
                globeCount = count;
                letter = str.charAt(i);
            }
            count = 1;
        }
        return letter;
    }
}
