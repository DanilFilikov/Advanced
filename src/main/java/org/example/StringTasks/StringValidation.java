package org.example.StringTasks;

import java.util.Scanner;

public class StringValidation {

    public static boolean validateString(Scanner in) {
        System.out.println("\nПровалидировать строку на закрывающиеся скобки");
        System.out.println("Введите строку");
        String str = in.next();
        System.out.println("Исходная строка " + str);
        int opencloseCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                opencloseCount += 1;
            }
            else if (str.charAt(i) == ')') {
                opencloseCount -= 1;
                if (opencloseCount < 0) {
                    break;
                }
            }
        }
        return opencloseCount == 0;
    }
}
