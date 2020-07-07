package ru.live.toofast;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class BoxWithNumbersTest {

    @Test
    public void testAverage(){
        BoxWithNumbers<Integer> box = new BoxWithNumbers<>(1, 2);
        double avg = box.avg();
        Assert.assertTrue(1.5 == avg);
    }

    @Test
    public void testCompareWithOtherBox(){
        BoxWithNumbers<Integer> box = new BoxWithNumbers<>(1, 2, 3, 4, 5);
        BoxWithNumbers<Double> other = new BoxWithNumbers<>(1.0, 2.0, 3.0, 4.0, 5.0);
        Assert.assertTrue(box.equalByAvg(other));
    }


    @Test
    public void testFloatNumbers(){
        double result = 0.0;
        for (int i = 0; i < 100; i++) {
            result += 0.001;
        }
        Assert.assertEquals(0.1, result, 0.001);
    }


}