package org.example.StringTasks;

import lombok.Value;

@Value
public class Students {
    org.example.StringTasks.Sex Sex;
    String name;
    int age;

    @Override
    public String toString() {
        return name;
    }
}
