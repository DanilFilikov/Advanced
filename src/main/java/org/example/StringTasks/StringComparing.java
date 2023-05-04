package org.example.StringTasks;

public class StringComparing {

    public static boolean compareString(String str, String str2) {
        System.out.println("\nОпределяющий, является ли одна строка перестановкой другой");
        System.out.println("Исходные строки " + str + " " + str2);
        StringBuilder str3 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str.charAt(i) == str2.charAt(j)) {
                    str3.append(str.charAt(i));
                    break;
                }
            }
        }
        return str.contentEquals(str3);
    }
}