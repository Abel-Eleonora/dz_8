package com.company;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//
//        Person person1 = new Person("Garry", "Potter",new Address("Little Whinging", " Privet Drive", 4));
//        Person person2 = new Person("Hermione", "Granger",new Address("London", " Heathgate", 9));
//        Person person3 = new Person("Ron", "Weasley",new Address("OtterySt Catchpole", "The Burrow", 1));


        Person  person1 = new Person("Garry", "Potter", new Address("Little Whinging", "Privet Drive", 4));
    Person  person2 = new Person("Hermione", "Granger", new Address("London", "Heathgate", 9));
    Person  person3 = new Person("Ron", "Weasley", new Address("Ottery St Catchpole", "The Burrow", 1));
    Person  person4 = new Person(null, "Potter", new Address("Little Whinging", "Privet Drive", 4));
    Person  person5 = new Person("Hermione", null , new Address("London", "Heathgate", 9));
    Person  person6 = new Person("Ron", "Weasley", null);

    List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        persons.stream()
                .filter(a -> a.getFirstName() != null)
                .filter(b -> b.getLastName() != null)
                .filter(c -> c.getAddress() != null)
                .sorted(Comparator.comparing(person -> person.getAddress().getId()))
                .map(Person::toString)
                .collect(Collectors.toList())
                .forEach(System.out::println);









    }

}
