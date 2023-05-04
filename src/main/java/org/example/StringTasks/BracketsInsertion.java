package org.example.StringTasks;

import java.util.Scanner;

public class BracketsInsertion {

    public static String addBrackets(Scanner in) {
        System.out.println("\nДобавить открывающиеся и закрывающиеся скобки");
        System.out.println("Введите строку");
        StringBuilder str = new StringBuilder(in.next());
        System.out.println("Исходная строка " + str);
        for (int i = 0; i < str.length() / 1.5; i += 2) {
            str.insert(i, '(');
        }
        for (int i = (int) (str.length() / 1.5 + 1); i <= str.length(); i += 2) {
            str.insert(i, ')');
        }
        return str.toString();
    }
}
