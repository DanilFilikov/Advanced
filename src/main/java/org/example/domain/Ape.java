package org.example.domain;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class Ape extends Animal {
    String race;
    int apeIq;

    public Ape(String animalName, String animalKingdom, String race, int apeIq) {
        super(animalName, animalKingdom);
        this.race = race;
        this.apeIq = apeIq;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void walk() {
        System.out.println(race + " is walking, his iq is " + apeIq);
    }
}
