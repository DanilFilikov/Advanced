package org.example.StreamTask;

import org.example.StringTasks.Sex;
import org.example.StringTasks.Students;

import java.util.List;
import java.util.stream.Stream;

public class CollectionsListof {

    public void getTask2(List<Students> list){
        int count = 0;
        for (Students student : list
        ) {
            if (student.getSex().equals(Sex.MAN) & student.getAge() > 18 & student.getAge() < 27) {
                System.out.println(student.getName() + " получит повестку");
            }
        }
        for (Students student : list
        ){
            if((student.getSex().equals(Sex.MAN) & student.getAge() >= 18 & student.getAge() < 60) ||
                    (student.getSex().equals(Sex.WOMEN) & student.getAge() >= 18 & student.getAge() < 55)){
                count++;
            }
        }
        System.out.println(count + " потенциальных работяг");
    }

    public void addToString(List<String> list) {
        Stream<String> stream = list.stream();
        stream
        .map(x -> x + "_1")
        .forEach(System.out::println);
    }

    public void sortCollection(List<String> list) {
        Stream<String> stream = list.stream();
        stream
        .sorted()
        .forEach(System.out::println);
    }

    public void getArray(List<String> list){
        Stream<String> stream = list.stream();
        stream
        .map(x -> x.split("")[1])
        .forEach(System.out::println);
    }
    public void sortDeleteString(List<String> list){
        Stream<String> stream = list.stream();
        stream
        .sorted()
        .distinct()
        .forEach(System.out::println);
        stream.close();
    }
}
