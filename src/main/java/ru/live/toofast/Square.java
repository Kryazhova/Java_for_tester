package ru.live.toofast;

public class Square implements Comparable<Square>{
    private int area;

    public Square(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                '}';
    }


    @Override
    public int compareTo(Square o) {
        return this.area - o.area;
    }
}
