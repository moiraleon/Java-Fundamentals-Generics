package com.devmountain.java.fundamentals;

import java.util.Map;

public class MapExamples {
    public static void main (String[]args){
        Person maryKate = new Person(" Mary Kate", 35);
        Person andAshley = new Person(" and Ashley", 35);
        Person demiLovato = new Person(" Demi Lovato", 29);


        //key,value
        Map<String, Person> olsenTwins = new Hashmap<>();//means we want to look up olsenWins characters by name
        olsenTwins.put(maryKate.getName(), maryKate);//can map key to random or different/new variabl;e and newest key input will override

        System.out.println(olsenTwins.get("Mary Kate")); //this will tell us which value(person) is associated with which key

        for(String name: olsenTwins.keySet()){//printing out name
            System.out.println(name);
        }

        for(Person person: olsenTwins.keySet()){//printing out person object
            System.out.println(person);
        }

        for(Map.Entry<String, Person> entry: olsenTwins.entrySet()){//printing out key and value
            System.out.println(entry);//or
            System.out.println(entry.getKey());
            System.out.println(entry.getValue()); //these two will print out the same both key and value but on separate lines i.e. separate values
        }

//get allows accessing values on a map and put allows adding values to a map

    }
}
