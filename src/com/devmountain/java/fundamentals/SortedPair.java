package com.devmountain.java.fundamentals;


//type bounds allow us to distignuish which pair or variable velongs where
                                    //addong T to restrict comparable values
public class SortedPair<T extends Comparable<T>> {

    private final T first;
    private final T second;

    public SortedPair(T left, T right) {
        if (left.compareTo(right) < 0) {
            first = left;
            second = right;
        } else {
            first =right;
            second =left;
        }

    }
    //create getters for first and second

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public interface Comparable<T> {
        public int compareTo(T o);
    }
}
