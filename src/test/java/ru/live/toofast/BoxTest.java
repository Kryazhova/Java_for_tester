package ru.live.toofast;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {

    @Test
    public void testMe(){
        Box box = new Box();
        box.setContent(42L);
        Long content = (Long) box.getContent();
        Assert.assertEquals(new Long(42L), content);
    }

    @Test(expected = ClassCastException.class)
    public void testWrongContentBehavior(){
        Box box = new Box();
        box.setContent("Hello");
        Long content = (Long) box.getContent();
    }

}