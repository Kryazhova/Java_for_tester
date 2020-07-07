package ru.live.toofast;

import java.io.Serializable;
import java.util.Arrays;

public class BoxWithNumbers<N extends Number> {

    private N[] numbers;

    public BoxWithNumbers(N... numbers) {
        this.numbers = numbers;
    }

    public double avg(){

        double result = 0.0;
        for (N number : numbers) {
            result += number.doubleValue();
        }
        return result / numbers.length;
    }

    public boolean equalByAvg(BoxWithNumbers<?> other){
        return this.avg() == other.avg();
    }

    @Override
    public String toString() {
        return "BoxWithNumbers{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
