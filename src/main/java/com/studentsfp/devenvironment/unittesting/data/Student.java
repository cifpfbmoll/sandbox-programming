package com.studentsfp.devenvironment.unittesting.data;

/**
 * com.studentsfp.devenvironment.unittesting.data
 * Class Student
 * 09/09/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Student {
    private long id;
    private String name;
    private double mark;

    public Student() {
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
