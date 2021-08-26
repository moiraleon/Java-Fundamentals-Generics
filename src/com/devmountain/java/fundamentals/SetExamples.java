package com.devmountain.java.fundamentals;

public class SetExamples {

    public static void main(String[]args){
        Person maryKate = new Person(" Mary Kate", 35);
        Person andAshley = new Person(" and Ashley", 35);
        Person demiLovato = new Person(" Demi Lovato", 29);

//        List<Person> olsenTwins = new ArrayList<>();
//        olsenTwins.add(maryKate);
//        olsenTwins.add(andAshley);
//        olsenTwins.add(andAshley);//array lists do not ensure uniqueness -so conversion to Set will throw errors

        Set <Person> olsenTwins = new HashSet<>();
        olsenTwins.add(maryKate);
        olsenTwins.add(andAshley);
        olsenTwins.add(andAshley);//when running with a set the second "andAshley" will not be added

        //.contains method can be used on sets
        //ie
        System.out.println(olsenTwins.contains(maryKate)); //returns true
        System.out.println(olsenTwins.contains(demiLovato));//returns false

        for( Person person: olsenTwins){
            System.out.println(person);

        }

    }
}
