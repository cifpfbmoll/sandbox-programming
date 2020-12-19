package com.studentsfp.devenvironment.unittesting.p1.data;

/**
 * com.fbmoll.programming.data
 * Class Person
 * 11/12/2020
 *
 *  > PascalCase
 *  > camelCase
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Person parent;
    public Integer legs;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }
}
