package com.devmountain.java.fundamentals;

public class SortingExamples {
    public static void main(String[] args) {

    //collections, and sort takes two parameters
        @FunctionalInterface
        Collections.sort(olsenTwins, new AgeComparator());//sorts youngest  first

                public interface Comparator<T>{


            int compare (T o1, T o2);//takes in a left and right value to compare two parameters
        }


        final Person youngestCastMember = (Person) min(olsenTwins, new AgeComparator());//finding youngest person in group
        System.out.println(youngestCastMember);
    }

    public static Object min(List values, Comparator comparator){
         if(values.isEmpty()){
             throw new IllegalArgumentException("List is empty");
         }
         Object lowestElement = values.get(0);
         for (int i= 1;i< values.size(); i++){
             final Object element = values.get(i);
             if (comparator.compare(element, lowestElement)<0){
                 lowestElement = element;
             }
         }
         return lowestElement;
    }



}
