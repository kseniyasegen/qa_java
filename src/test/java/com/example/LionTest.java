package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Lion lion;

    @Mock
    Feline feline;

    //проверка метода getKittens()
    @Test
    public void getKittensReturnsCorrectGetKitten1() {
        Lion lion = new Lion(feline);
        int expectedKittens = 10;
        Mockito.when(lion.getKittens()).thenReturn(10);
        int actualKittens = lion.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);
    }

    //проверка метода doesHaveMane для Самец
    @Test
    public void doesHaveManeReturnsCorrectHasMane1() throws Exception {
        Lion lion = new Lion("Самец");
        boolean expectedHasMan = true;
        boolean actualHasMan = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMan, actualHasMan);
    }

    //проверка метода doesHaveMane для Самка
    @Test
    public void doesHaveManeReturnsCorrectHasMane2() throws Exception {
        Lion lion = new Lion("Самка");
        boolean expectedHasMan = false;
        boolean actualHasMan = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMan, actualHasMan);
    }

    //проверка метода doesHaveMane для qqqqqq
    @Test
    public void doesHaveManeReturnsCorrectHasMane3() throws Exception {
        try {
            Lion lion = new Lion("qqqqqq");
            lion.doesHaveMane();
        } catch (Exception e) {

        }
    }

    //проверка метода getFood()
    @Test
    public void getFoodReturnsCorrectGetFoodForLine() throws Exception {
        Lion lion = new Lion(feline);
        List<String> expectedArrayListLion = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualArrayListLion = lion.getFood("Хищник");
        Assert.assertEquals(expectedArrayListLion, actualArrayListLion);
    }
}
