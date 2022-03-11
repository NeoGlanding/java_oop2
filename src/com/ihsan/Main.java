package com.ihsan;

public class Main {

    public static void main(String[] args) {
	    Bottoms gucci = new Bottoms("Gucci", "black");
        Shirts alabama = new Shirts("Alabama", "black");
        Person ihsan = new Person("Ihsan", alabama, gucci);

        System.out.println(ihsan.getShirts().getBrands());
    }
}
