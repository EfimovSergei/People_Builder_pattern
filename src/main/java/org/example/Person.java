package org.example;

import java.util.OptionalInt;

public class Person {
    String name;
    String surname;
    OptionalInt age;
    String address;

    public boolean hasAge() {
        if (this.age.isPresent()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        System.out.println("Happy Birthday, " + name);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + ", address='" + address + '\'' + '}';
    }

//    @Override
//    public int hashCode() { /*...*/ }

    public PersonBuilder newChildBuilder() {
        var child = new PersonBuilder();
        if (hasAddress()) {
            child.setAddress(getAddress());
        }
        child.setSurname(getSurname()).build();

        return child;
    }
}