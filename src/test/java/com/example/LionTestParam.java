package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class) // добавила раннер Parameterized
public class LionTestParam {
    //поля класса:
    private final String hasMane;
    private final boolean expectedHasMan;

    //конструктор с параметрами
    public LionTestParam(String hasMane, boolean expectedHasMan) {
        this.hasMane = hasMane;
        this.expectedHasMan = expectedHasMan;
    }

    //метод для получения данных
    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeReturnsCorrectHasManeParam() throws Exception {
        Lion lion = new Lion(hasMane);
        boolean actualHasMan = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMan, actualHasMan);
    }
}