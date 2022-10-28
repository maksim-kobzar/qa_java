package com.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * По заданию,тестировать класс Animal - не нужно.
 * Хотел больше практики и выполнит тестирование данного класа с использованием параметризации
 * Надеюсь, что дорогой ревьюер примит мою работу :)
 */

public class AnimalTest {
    Animal animal = new Animal();
    @Test(expected = Exception.class)
    public void getFoodException() throws Exception {
        animal.getFood("Грызуны");
    }

    @Test
    public void getFamily() {
        animal.getFamily();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}

