package org.example.domain;

public class Ape extends Animal {
    private String race;
    private int apeIq;


    public Ape(String animalName, String animalKingdom, String race) {
        super(animalName, animalKingdom);
        this.race = race;
    }

   public void setSound(String sound){
        this.sound = sound;
   }

    public void setApeIq(int apeIq) {
        this.apeIq = apeIq;
    }

    public void walk(){
       System.out.println(race + " is walking, his iq is " + apeIq);
   }
}
