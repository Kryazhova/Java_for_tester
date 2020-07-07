package ru.live.toofast;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void squareOrderTest(){
        Square first = new Square(16);
        Square second = new Square(32);
        Square third = new Square(64);
        List<Square> squares = new ArrayList<>(Arrays.asList(second, first, third));

        Collections.sort(squares);
        System.out.println(squares);
    }

    @Test
    public void compareStringsByLength(){
        List<String> strings = new ArrayList<>(Arrays.asList("bbbb","aaa", "c"));
        strings.sort(Comparator.comparingInt(String::length));
        System.out.println(strings);
    }

    @Test
    public void filterAndPowerTest(){
        List<Double> input = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));
        List<Double> result = input.stream()
                .filter(aDouble -> aDouble % 2 < 0.0001)
                .map(aDouble -> Math.pow(aDouble, 2.0))
                .collect(Collectors.toList());


        Assert.assertEquals(result, Lists.newArrayList(4.0, 16.0, 36.0));
    }

}