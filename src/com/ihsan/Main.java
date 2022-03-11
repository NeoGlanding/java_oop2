package com.ihsan;

public class Main {

    public static void main(String[] args) {
	    Bottoms gucci = new Bottoms("Gucci", "black");
        Shirts alabama = new Shirts("Alabama", "black");
        Person ihsan = new Person("Ihsan", alabama, gucci);

        Room mainRoom = new Room(new Sofa("International", "Kubics", "ASUS"), "blue");

        System.out.println(mainRoom.getSofaManufacturer());

//        System.out.println(ihsan.getShirts().getBrands());
    }
}
