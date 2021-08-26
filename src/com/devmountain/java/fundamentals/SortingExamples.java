package com.devmountain.java.fundamentals;
                            //normally we can add our parameters here after the class name but for methods it is different

public class SortingExamples {
    public static void main(String[] args) {

    //collections, and sort takes two parameters
        @FunctionalInterface
        Collections.sort(olsenTwins, new AgeComparator());//sorts youngest  first

                public interface Comparator<T>{


            int compare (T o1, T o2);//takes in a left and right value to compare two parameters
        }

                                            //we can remove (PErson)cast
        final Person youngestCastMember = min(olsenTwins, new AgeComparator());//finding youngest person in group
        System.out.println(youngestCastMember);
    }
    //on methods the parameters go here between method modifieer declaration(public static) and before return type of method(object) change object return to T
//    public static <T>Object min(List values, Comparator comparator){
    public static <T> T min(List values, Comparator comparator){
         if(values.isEmpty()){
             throw new IllegalArgumentException("List is empty");
         }
//         Object lowestElement = values.get(0); we can now add a T
        T lowestElement = values.get(0);
         for (int i= 1;i< values.size(); i++){
//             final Object element = values.get(i); we can now add a T here
             final T element = values.get(i);
             if (comparator.compare(element, lowestElement)<0){
                 lowestElement = element;
             }
         }
         return lowestElement;
    }
/// ? extends -upper bound, get data out of parameter,covariance
    // ?super  - lower bound, put data into the parameter, contravariance

}
