package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private ColorEnum color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(15)+1;
    }
    public String getInfo(){
        return "Age: "+age+
                "\nColor: "+color+
                "\nShelter address: "+shelter.getAddress()+
                "\nShelter name: "+shelter.getName();
    }
}
