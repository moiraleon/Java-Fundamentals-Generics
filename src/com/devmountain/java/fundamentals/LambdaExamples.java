package com.devmountain.java.fundamentals;

//import ..persons class
import java.util.function.Predicate;

public class LambdaExamples {
    public static void main (String[]args)
    {
        final Person maryKate = new Person("Mary Kate", 35);
        final Person andAshley = new Person("and Ashley", 35);
        final Person demiLovato = new Person("Demi Lovato", 29);

        Predicate<Person> isOld = person -> person.getAge(>80);

        System.out.println(isOld.test(maryKate));
        System.out.println(isOld.test(mandAshley));
    }
}
