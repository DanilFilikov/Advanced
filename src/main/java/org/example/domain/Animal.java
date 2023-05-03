package org.example.domain;

public class Animal {

    private final String animalName;
    private final String animalKingdom;
    public String sound;

    public Animal(String animalName, String animalKingdom){
        this.animalName = animalName;
        this.animalKingdom = animalKingdom;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalKingdom() {
        return animalKingdom;
    }

    public void walk(){
        System.out.println(animalName + " is walking");
    }

    public void makeANoise(){
        System.out.println(animalName + " says " + sound);
    }
}
