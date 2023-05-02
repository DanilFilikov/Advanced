package org.example.Employer;

public class Employer {
        private String name;
        private int age;
        private int payment;
        private int experience;

    public Employer(String name, int age, int payment, int experience) {
        this.name = name;
        this.age = age;
        this.payment = payment;
        this.experience = experience;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPayment() {
        return payment;
    }

    public int getExperience() {
        return experience;
    }

}
