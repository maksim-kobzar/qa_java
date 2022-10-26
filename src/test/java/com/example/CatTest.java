package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertEquals("Ошибка в методе получения звука", "Мяу", cat.getSound());
    }

    @Test
    public void getListGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Хищник"));
        Assert.assertEquals("Ошибка в методе получения еды для Льва", List.of("Хищник"), cat.getFood());
    }

}
