package com.devmountain.java.fundamentals;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>{ //because we want to implement a comparator that compares person objects
    public int compare(final Person left, final Person right){
        return Integer.compare(left.getAge(), right.getAge());//returns youngest to oldest
        return -1* Integer.compare(left.getAge(), right.getAge());//returns oldest to youngest (this works because when compared it flips negative and positive values and zero values stay the same


        //or we cn writ e a reverser to simplify how much




    }
}
