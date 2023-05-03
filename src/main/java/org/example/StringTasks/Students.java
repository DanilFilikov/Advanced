package org.example.StringTasks;

import java.util.List;

public class Students {
    private final org.example.StringTasks.Sex Sex;
    private final String name;
    private final int age;

    public Students(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.Sex = sex;
    }

    public Sex getSex() {
        return Sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getOrder(List<Students> list) {

    }
}