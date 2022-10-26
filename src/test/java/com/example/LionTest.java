package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void LionMaleTest() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertTrue( lion.hasMane);
    }

    @Test
    public void LionFemaleTest() throws Exception {
        Lion lion = new Lion("Самка");
        Assert.assertFalse( lion.hasMane);
    }

    @Test(expected = Exception.class)
    public void LionOtherTest() throws Exception {
        Lion lion = new Lion("Иное");
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void getKittensTest() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(20);
        Assert.assertEquals("Ошибка в отображении количества котят", 20, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Хищник"));
        Assert.assertEquals("Ошибка в методе получения еды для Льва", List.of("Хищник"), lion.getFood());
    }

}