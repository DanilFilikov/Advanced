package org.example.StringTasks;

public class StringValidation {

    public static boolean validateString(String str) {
        System.out.println("\nПровалидировать строку на закрывающиеся скобки");
        System.out.println("Исходная строка " + str);
        int opencloseCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                opencloseCount += 1;
            } else if (str.charAt(i) == ')') {
                opencloseCount -= 1;
                if (opencloseCount < 0) {
                    break;
                }
            }
        }
        return opencloseCount == 0;
    }
}