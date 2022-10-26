package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

/**
 * По заданию,тестировать класс Animal - не нужно.
 * Хотел больше практики и выполнит тестирование данного класа с использованием параметризации
 * Надеюсь, что дорогой ревьюер примит мою работу :)
 */
@RunWith(Parameterized.class)
public class AnimalTest {
    private final String animalKindTest;
    Animal animal = new Animal();

    public AnimalTest(String animalKindTest) {
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

    @Test(expected = Exception.class)
    public void getFoodException() throws Exception {
        animal.getFood("Грызуны");
    }

    @Test
    public void getFamily() {
        animal.getFamily();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",  animal.getFamily());
    }
}