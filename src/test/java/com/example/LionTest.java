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
public class LionTest {

    @Mock
    Feline feline;

    //проверка метода getKittens()
    @Test
    public void getKittensReturnsCorrectGetKitten1() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedKittens = 10;
        Mockito.when(lion.getKittens()).thenReturn(10);
        int actualKittens = lion.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);
    }

    //проверка метода doesHaveMane для qqqqqq
    @Test(expected = Exception.class)
    public void doesHaveManeReturnsCorrectHasMane3() throws Exception {
        Lion lion = new Lion("qqqqqq", feline);
        try {
            lion.doesHaveMane();
        } catch (Exception e) {
        }
    }

    //проверка метода getFood()
    @Test
    public void getFoodReturnsCorrectGetFoodForLine() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedArrayListLion = Arrays.asList();
        List<String> actualArrayListLion = lion.getFood();
        Assert.assertEquals(expectedArrayListLion, actualArrayListLion);
    }
}
