package com.jakeodell.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Person {
    private String name;
    private Parrot parrot;

    public Person() {}

    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return parrot;
    }

}
