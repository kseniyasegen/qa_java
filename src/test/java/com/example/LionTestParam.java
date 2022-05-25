package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class) // добавила раннер Parameterized
public class LionTestParam {
    @Mock
    Feline feline;

    //поля класса:
    private final String sex;
    private final boolean expectedHasMan;

    //конструктор с параметрами
    public LionTestParam(String sex, boolean expectedHasMan) {
        this.sex = sex;
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
        Lion lion = new Lion(sex, feline);
        boolean actualHasMan = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMan, actualHasMan);
    }
}