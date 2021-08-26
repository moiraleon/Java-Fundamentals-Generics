package com.devmountain.java.fundamentals;

import java.util.comparator

        //creatigna  reverse comparator to reverse the sort order

                                            //or class name instead of Comparator
public class ReverseComparator<T> imlpements Comparator<T> {
    private final Comparator<T> delegateComparator;

    //add constructor comparator
    public ReversComparator( final Compataror <T> delegateComparator){
        this.delegateComparator = delegateComparator;
        }

    public int compare (final T left, final T right){
        return -1* delegateComparator.compare(left,right);
        }

}
