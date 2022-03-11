package com.ihsan;

public class Person {
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
