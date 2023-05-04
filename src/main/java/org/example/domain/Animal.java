package org.example.domain;

import lombok.Data;

@Data
public class Animal {

    private final String animalName;
    private final String animalKingdom;
    public String sound;

    public void walk(){
        System.out.println(animalName + " is walking");
    }

    public void makeANoise(){
        System.out.println(animalName + " says " + sound);
    }
}
