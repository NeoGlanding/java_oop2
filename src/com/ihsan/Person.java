package com.ihsan;

public class Person {
//    Composition is one of the fundamental concepts in object-oriented programming. It describes a class that references one or more objects of other classes in instance variables. This allows you to model a has-a association between objects.
    private String name;
    private Shirts shirts;
    private Bottoms bottoms;

    public Person(String name, Shirts shirts, Bottoms bottoms) {
        this.name = name;
        this.shirts = shirts;
        this.bottoms = bottoms;
    }

    public String getName() {
        return name;
    }

    public Shirts getShirts() {
        return shirts;
    }

    public Bottoms getBottoms() {
        return bottoms;
    }
}
