package com.devmountain.java.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[]args){
        Person maryKate = new Person(" Mary Kate", 35);
        Person andAshley = new Person(" and Ashley", 35);

        List<Person> olsenTwins = new ArrayList<Person>(); //or List<Person> olsenTwins = new ArrayList<>(); with diamond means to infer the left side parameters and fill it in with the generics
        olsenTwins.add(maryKate);
        olsenTwins.add(andAshley);

        System.out.println(olsenTwins);

        olsenTwins.add(new Person("Demi Lovato",29));

//        olsenTwins.add(new Object()); can not pass in an object-> not compiled to add objects, only 'person'

        System.out.println(olsenTwins);

        System.out.println(olsenTwins.size());
        System.out.println(olsenTwins.get(0)); //get element at certain index

        final Person person = olsenTwins.get(2);
        System.out.println(person); //printing this specific variable


        final Iterator<Person> iterator= olsenTwins.iterator();
//        iterator.hasNext();// returns true or false
//        iterator.next(); //gets next element
        while (iterator.hasNext()){
        final Person person = iterator.next();
        System.out.println(person);
        }


        //or using a for loop

        for(Person person: olsenTwins){
            System.out.println(person);
        }


        for (int i=0; i< olsenTwins.size(); i++){
            final Person person = olsenTwins.get(i);
            System.out.println(person);
        }
    }
}
