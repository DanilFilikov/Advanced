package org.example.domain;

public class Cat extends Animal{

    private String race;
    private String furColor;

    public Cat(String animalName, String animalKingdom, String race) {
        super(animalName, animalKingdom);
        this.race = race;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    public String getCatName() {
        return race;
    }

    public String getFurColor() {
        return furColor;
    }

    public void walk(){
        System.out.println(race + getAnimalName() + "is walking");
    }
}
