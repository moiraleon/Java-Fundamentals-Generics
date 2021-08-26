package com.devmountain.java.fundamentals;

public class LegacyCode {
    public static void main(String[]args){
        List list= new ArrayList();
//        List <Object>= new ArrayList<>; //Raw types mean we have an unsafe scenario in our code
        list.add("abc");
        list.add(1);
        list.add(new Object());

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            final Object element = iterator.next();
            System.out.println(element);
        }
    }
}
