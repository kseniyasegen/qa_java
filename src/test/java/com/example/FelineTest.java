package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    //проверка метода getFamily()
    @Test
    public void getFamilyReturnsCorrectFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Mock
    Feline feline;

    //проверка метода eatMeat()
    @Test
    public void eatMeatReturnsCorrectGetFoodForFeline() throws Exception {
        Feline feline = new Feline();
        List<String> expectedArrayListFeline = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualArrayListFeline = Arrays.asList();
        actualArrayListFeline = feline.eatMeat();
        Assert.assertEquals(expectedArrayListFeline, actualArrayListFeline);
    }

    //проверка метода getKittens()
    @Test
    public void getKittensReturnsCorrectGetKitten() {

        int expectedKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittens = feline.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);
    }

    //проверка метода getKittens(int kittensCount)
    @Test
    public void getKittensReturnsCorrectKittensCount() {
        Feline feline = new Feline();
        int expectedKittensCount = 10;
        int actualKittensCount = feline.getKittens(10);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}