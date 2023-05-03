package org.example.StringTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Collections {

    public Set<Integer> set = new HashSet<>();

    public Set getCollection(ArrayList<Integer> array) {
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(4);
        array.add(1);
        array.add(3);
        array.add(4);
        System.out.println("Задание 1 ");
        System.out.println("Исходный массив " + array);
        set.addAll(array);
        return set;
    }

    public void getIterator() {
        System.out.println("Задание 2");
        for (Integer set : set
        ) {
            System.out.println(set);
        }
    }

    public int getNumberoftwo(int[] array) {
        System.out.println("Задание 3");
        System.out.println("Исходный массив " + Arrays.toString(array));
        int count = 0;
        for (int i = 0; i <= array.length; i++) {
            if ((i % 10 == 2) || (i / 10 == 2)) {
                count++;
            }
        }
        return count;
    }

    public boolean compareString(String str, String str2) {
        System.out.println("Задание 4");
        System.out.println("Исходные строки " + str + " " + str2);
        String str3 = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str.charAt(i) == str2.charAt(j)) {
                    str3 += str.charAt(i);
                    break;
                }
            }
        }
        return str.equals(str3);
    }

    public String compressBad(String str) {
        System.out.println("Задание 5");
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

    public char getChar(String str) {
        System.out.println("Задание 6");
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

    public boolean validateString(String str) {
        System.out.println("Задание 7");
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

     public String addBrackets(StringBuilder str) {
         System.out.println("Задание 8");
         System.out.println("Исходная строка " + str);
         for (int i = 0; i < str.length() / 1.5; i += 2) {
             str.insert(i, '(');
         }
         for (int i = (int) (str.length() / 1.5 + 1); i <= str.length(); i += 2){
             str.insert(i, ')');
         }
         return str.toString();
     }

     public String mergeSpace(String str){
         System.out.println("Задание 9");
         System.out.println("Исходная строка " + str);
        str = str.trim();
        str = str.replaceAll("\\s{2,}", " ");
        return str;
        }


     public int countCouple(int[] array){
         System.out.println("Задание 10");
        int count = 0;
         System.out.println("Исходный массив " + Arrays.toString(array));
        for(int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j ++) {
                if (array[i] == array[j] & i < j) {
                    count++;
                }
            }
        }
        return count;
    }

}



