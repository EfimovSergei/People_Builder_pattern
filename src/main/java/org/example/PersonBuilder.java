package org.example;

import java.util.OptionalInt;

public class PersonBuilder {
    Person person = new Person();

    public PersonBuilder setName(String name) {

        person.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        person.surname = surname;
        return this;
    }


    public PersonBuilder setAge(int age) {
        person.age = OptionalInt.of(age);
        return this;

    }

    public PersonBuilder setAddress(String address) {

        person.address = address;
        return this;

    }

    public Person build() {
        return person;
    }
}
