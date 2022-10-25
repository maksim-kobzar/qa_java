package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {
    @Mock
     Cat cat;

    @Test
    public void getSoundTest(){
        cat.getSound();
        Assert.assertEquals("Ошибка в методе получения звука", null, cat.getSound());
    }

    @Test
    public void getListGetFood() throws Exception{
        cat.getFood();


    }

}
