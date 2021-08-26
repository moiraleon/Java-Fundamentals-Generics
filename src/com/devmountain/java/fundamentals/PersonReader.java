package com.devmountain.java.fundamentals;

public class PersonReader {
    public static void main(Strin[]args) throws FileNotFoundException{
        PersonReader reader = new PersonReader();

        DataInputStream stream = new DataInputStream(new FileInputStream
                ("src/main/resources/person")); //example pathway
        Person person =reader.read(stream);
        System.out.println.(person);
    }
//T extends DataInput & Closeable
    public Person read(final DataInputStream source){
        try(DataInputStream input = source){
            return new Person(input.readUTF(), input.readInt());
        }
        catch (IOException e){
            throw new Runtimexception(e);
        }
    }
}
//Intersection should only be used on rare occasions where it's necessary and there's no other choice

//lambda expressions can alsp be cast i.e. (Serializable & Runnable)