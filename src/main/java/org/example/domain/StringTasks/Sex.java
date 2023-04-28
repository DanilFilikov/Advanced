package org.example.domain.StringTasks;

public enum Sex {
    MAN("Мужчина"),
    WOMEN("Женщина");

    private final String title;

    Sex(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}