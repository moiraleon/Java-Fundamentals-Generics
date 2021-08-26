package com.devmountain.java.fundamentals;

//import ..persons class
import java.util.function.Predicate;

public class LambdaExamples {
    public static void main (String[]args)
    {
        final Person maryKate = new Person("Mary Kate", 35);
        final Person andAshley = new Person("and Ashley", 35);
        final Person demiLovato = new Person("Demi Lovato", 29);

//        Predicate<Person> isOld = person -> person.getAge(>80);
//
//        System.out.println(isOld.test(maryKate));
//        System.out.println(isOld.test(mandAshley));

        //or using Java 8 Stream System

//        Map<Boolean>, List<Person>> oldAndYoungPeople = for rewturning people old and young
        Map<Boolean>, Long> oldAndYoungPeople = //counts individuals in each group
            people.stream()
                    .collect(partitioningBy(person-> person.getAge()>80,
                            .counting()));

        System.out.println(oldAndYoungPeople);
//when havign errors with lambda expression check first to see that the target type is correct Map<Boolean>, Long>
        //then revise type usage inside lambda expression person-> person.getAge()>80,


    }
}
