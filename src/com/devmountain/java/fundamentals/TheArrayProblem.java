package com.devmountain.java.fundamentals;

public class TheArrayProblem {
    public static void main(String[] args) {
        Person maryKate = new Person(" Mary Kate", 35);
        Person andAshley = new Person(" and Ashley", 35);

        Person[] olsenTwins = {maryKate, andAshley};
        System.out.println(Arrays.toString(olsenTwins));

//        Person demiLovato = new Person("Demi Lovato", 29);
//        olsenTwins[2] = demiLovato; can not add a new variable to array. Arrays have preselected lengths
//adding an element to an array via copying the array

        private staticPerson[] add(final Person person, Person[] array ){
            array = Arrays.copyOf(array, length + 1)
                    array[length] = person;
                    return array;

                    //checking to see if array contains certain elements? arrays do not have this funcitonality
            //arrays are primitive and not best when working with data
        }
    }
}