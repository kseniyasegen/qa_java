package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    //проверка метода getSound()
    @Test
    public void getSoundReturnsCorrectText() {
        Cat cat = new Cat(feline);
        String expecteedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expecteedSound, actualSound);
    }

    //проверка метода getFood()
    @Test
    public void getFoodThrowsException() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Assert.assertNotNull(cat.getFood());


    }

}




