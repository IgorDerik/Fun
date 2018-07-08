package People;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Person john = new Person("John", 11);
        Person alisa = new Person("Alisa", 19);
        Person bob = new Person("Bob", 55);
/*
        Getter<String> nameGetter = Person::getName;
        Getter<Integer> ageGetter = Person::getAge;
        System.out.println( nameGetter.getProperty(alisa) );
        System.out.println( ageGetter.getProperty(alisa) );
        */
        Checker checker18 = person -> person.getAge()>17 ;

        Checker checkerTest = Person::getFalse;

        System.out.println( checkerTest.checkYears(new Person("",1)) );

//        System.out.println( checker18.checkYears(john) );

    }

}
