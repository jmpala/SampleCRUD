package io.jmpalazzolo.chesstutotial.model;

import java.util.Date;

public class Student extends BaseUser {

    private String name;
    private Date birthDate;
    private Degree degree;

    public Student(String name, Date birthDate, Degree degree) {
        this.name = name;
        this.birthDate = birthDate;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
