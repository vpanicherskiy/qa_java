package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;
    Alex alex;

    @Before
    public void setUp() throws Exception {
        alex = new Alex(feline);
    }

    @Test
    public void getFriends() {
        String expected = "Марти, Глория, Мелман";
        String actual = alex.getFriends();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLiving() {
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittens() {
        int expected = 0;
        int actual = alex.getKittens();
        Assert.assertEquals(expected, actual);
    }
}
