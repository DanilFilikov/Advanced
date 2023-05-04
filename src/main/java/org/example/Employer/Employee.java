package org.example.Employer;

import lombok.Value;

@Value
public class Employee {
    String name;
    int age;
    int payment;
    int experience;

    @Override
    public String toString() {
        return name + " " + payment;
    }
}
