package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.Employee.EmployeeInfo;
import org.example.StreamTask.CollectionsListOf;
import org.example.StringTasks.Sex;
import org.example.StringTasks.Students;
import org.example.domain.Animal;
import org.example.domain.Cat;

import static org.example.StringTasks.BracketsInsertion.addBrackets;
import static org.example.StringTasks.EqualPairs.countCouple;
import static org.example.StringTasks.Iterator.getIterator;
import static org.example.StringTasks.MostRepeatingChar.getChar;
import static org.example.StringTasks.NumberOfTwo.getNumberOfTwo;
import static org.example.StringTasks.NumberOfTwo.getNumberOfTwo;
import static org.example.StringTasks.SpaceMerging.mergeSpace;
import static org.example.StringTasks.StringComparing.compareString;
import static org.example.StringTasks.StringCompressing.compressBad;
import static org.example.StringTasks.StringValidation.validateString;
import static org.example.StringTasks.Collection.getCollection;
public class Menu {
    public  Scanner in = new Scanner(System.in);
    public  List<Students> list = List.of(new Students(Sex.MAN, "Вася", 16), new Students(Sex.MAN, "Петя", 23),
            new Students(Sex.WOMEN, "Елена", 42), new Students(Sex.MAN, "Иван петрович", 69));
    public  List<String> list2 = List.of("a1", "a4", "a3", "a2", "a1", "a4");

    public void menu() {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        CollectionsListOf listOf = new CollectionsListOf();
        Animal cat = new Cat("Cat", "mammal", "British cat", "Gray");
        ArrayList<Object> array = new ArrayList<>();
        boolean isWorking = true;
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(2);
        array.add(1);
        array.add(4);
        while(isWorking) {
            System.out.println("""
                     \n
                     Выберите задание:
                     1)Получить коллекцию без дубликатов
                     2)Итератор по массиву
                     3)Кол-во цифр 2 используемых в десятичной записи целых чисел
                     4)Является ли строка перестановкой другой
                     5)Сжатие строки
                     6)Найти первый наиболее повторяющийся в строке символ
                     7)Провалидировать строку на закрывающиеся скобки
                     8)Добавить открывающиеся и закрывающиеся скобки в строке
                     9)Преобразовать все идущие подряд пробелы в один
                     10)Найти кол-во иденичных пар чисел
                     11)Задача на стримы
                     12)Задача про сотрудников
                     13)Выход
                    """);
            switch (in.nextInt()) {
                case 1 ->   System.out.println(getCollection(array));
                case 2 ->   getIterator(in);
                case 3 ->   System.out.println(getNumberOfTwo(in) + " цифр «2»");
                case 4 ->   compareString(in);
                case 5 ->   System.out.println("Сжатая строка" + compressBad(in));
                case 6 ->   System.out.println("Наиболее повторяющийся символ" + getChar(in));
                case 7 ->   validateString(in);
                case 8 ->   System.out.println(addBrackets(in));
                case 9 ->   System.out.println(mergeSpace(in));
                case 10 ->  System.out.println(countCouple(in) + "Идентичных пар");
                case 11 ->  {
                    listOf.getTask2(list);
                    listOf.addToString(list2);
                    listOf.sortCollection(list2);
                    listOf.getArray(list2);
                    listOf.sortDeleteString(list2);
                }
                case 12 ->  {
                    employeeInfo.returnEmployees();
                    employeeInfo.returnMaxPayment();
                    employeeInfo.getAveragePayment();
                    employeeInfo.getSumPayment();
                    employeeInfo.getSomePayment();
                }
                case 13 -> {
                    in.close();
                    isWorking = false;
                }
            }
        }
    }
}