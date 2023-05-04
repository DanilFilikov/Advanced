package org.example.domain;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class Cat extends Animal {

    String race;
    String furColor;

    public Cat(String animalName, String animalKingdom, String race, String furColor) {
        super(animalName, animalKingdom);
        this.race = race;
        this.furColor = furColor;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void walk() {
        System.out.println(race + getAnimalName() + "is walking");
    }
}
