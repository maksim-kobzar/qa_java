package com.example;

import java.util.List;

public class Cat {

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() { //метод получения звука
        return "Мяу";
    }

    public List<String> getFood() throws Exception { //метод получения еды
        return predator.eatMeat();
    }

}
