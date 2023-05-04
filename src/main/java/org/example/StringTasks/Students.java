package org.example.StringTasks;

import lombok.Value;

import java.util.List;
@Value
public class Students {
    org.example.StringTasks.Sex Sex;
    String name;
    int age;

    public Students(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.Sex = sex;
    }

    public String getName() {
        return name;
    }

        @Override
        public String toString() {
            return name;
        }
}
