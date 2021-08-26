package com.devmountain.java.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[]args){
        Person maryKate = new Person(" Mary Kate", 35);
        Person andAshley = new Person(" and Ashley", 35);

        List<Person> olsenTwins = new ArrayList<Person>();
        olsenTwins.add(maryKate);
        olsenTwins.add(andAshley);

        System.out.println(olsenTwins);

        olsenTwins.add(new Person("Demi Lovato",29));
        System.out.println(olsenTwins);
    }
}
