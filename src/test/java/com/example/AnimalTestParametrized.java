package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTestParametrized {
    private final String animalKindTest;
    Animal animal = new Animal();

    public AnimalTestParametrized(String animalKindTest) {
        this.animalKindTest = animalKindTest;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Травоядное"},
                {"Хищник"},
        };
    }

    @Test
    public void getFood() throws Exception {
        if (animalKindTest.equals("Травоядное")) {
            System.out.println(animal.getFood(animalKindTest));
            Assert.assertEquals("Ошибка в возвращении еды для травоядных", List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
        } else if (animalKindTest.equals("Хищник")) {
            System.out.println(animal.getFood(animalKindTest));
            Assert.assertEquals("Ошибка в возвращении еды для травоядных", List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));
        }
    }
}
