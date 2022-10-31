package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        feline.getFamily();
        Assert.assertEquals("Неправильное семейство", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        feline.getKittens();
        Assert.assertEquals("Ошибка в методе отображений котят", 1, feline.getKittens());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        feline.getKittens(20);
        Assert.assertEquals("Ошибка в методе получения котят", 20, feline.getKittens(20));
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        feline.eatMeat();
        Assert.assertEquals("Ошибка в методе возврата еды", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}