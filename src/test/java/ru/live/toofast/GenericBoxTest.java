package ru.live.toofast;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenericBoxTest {

    @Test
    public void testBox(){

        GenericBox<Integer> box = new GenericBox<>();
        GenericBox<String> stringBox = new GenericBox<>();

        Integer content = box.getContent();
        String content1 = stringBox.getContent();

    }


}