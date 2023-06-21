package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
    Lion lion;

    @Before
    public void SetUp() throws Exception {
        lion = new Lion(feline, "Самец");
    }

    @Test
    public void getKittens() {
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void doesHaveManeUnknownSexThrowsException() {
        try {
            lion = new Lion(feline, "sex");
            fail("Ожидается Exception");
        } catch (Exception exception) {
            String expected = "Используйте допустимые значения пола животного - самец или самка";
            String actual = exception.getMessage();
            assertEquals(expected, actual);
        }
    }

    @Test
    public void getFood() throws Exception {
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}
