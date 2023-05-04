package org.example.StreamTask;

import org.example.StringTasks.Sex;
import org.example.StringTasks.Students;

import java.util.List;

public class CollectionsListOf {

    public void getTask2(List<Students> list) {

        System.out.println("Выбрать кому придет повестка");
        list.stream().filter(students -> students.getAge() >= 18 && students.getSex() == Sex.MAN && students.getAge() < 27)
                .map(Students::toString).forEach(System.out::println);

        System.out.println("Найти кол-во потенциальных работяг");
        list.stream().filter(students -> students.getSex() == Sex.MAN && students.getAge() >= 18 && students.getAge() < 60
                || students.getSex() == Sex.WOMEN && students.getAge() >= 18 && students.getAge() < 55).map(Students::toString).forEach(System.out::println);

    }

    public void addToString(List<String> list) {
        System.out.println("\nДобавить _1 к каждому элементу");
        list.stream()
                .map(x -> x + "_1")
                .forEach(System.out::println);
    }

    public void sortCollection(List<String> list) {
        System.out.println("\nОтсортировать коллекцию строк по алфавиту");
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public void getArray(List<String> list) {
        System.out.println("\nВ коллекции убрать первый символ и вернуть массив чисел");
        list.stream()
                .map(x -> x.split("")[1])
                .forEach(System.out::println);
    }

    public void sortDeleteString(List<String> list) {
        System.out.println("\nОтсортировать коллекцию строк по алфавиту и убрать дубликаты");
        list.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
