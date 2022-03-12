package com.ihsan;

class Jeep extends Car {

    public Jeep(String series, int cylinder) {
        super(series, cylinder);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Jeep Beast Engine STARTED");
    }

    @Override
    public void accelerate() {
        System.out.println("Beast Started");
    }
}

class Porsche extends Car {
    public Porsche(String series, int cylinder) {
        super(series, cylinder);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("BADASS Engine Started");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("BADASS Engine go with 30km/h");
    }
}

class Bentley extends Car {
    public Bentley(String series, int cylinder) {
        super(series, cylinder);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Elegant Engine Started");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("Elegant Engine move slowly but sure");
    }
}

public class Main {

    public static void main(String[] args) {
	    Bottoms gucci = new Bottoms("Gucci", "black");
        Shirts alabama = new Shirts("Alabama", "black");
        Person ihsan = new Person("Ihsan", alabama, gucci);

        Room mainRoom = new Room(new Sofa("International", "Kubics", "ASUS"), "blue");

//        System.out.println(mainRoom.getSofaManufacturer());

        Printer myPrinter = new Printer(100, "My Printer");

        Jeep rubicon = new Jeep("Rubicon", 200);
        Porsche xModel = new Porsche("X Model", 400);
        Bentley mulsanne = new Bentley("Mulsanne", 200);

        rubicon.startEngine();
        xModel.startEngine();
        mulsanne.startEngine();

//        System.out.println(myPrinter.getTonerLevel());
//        myPrinter.setPagesPrinted(20);
//        myPrinter.setPagesPrinted(20);
//        System.out.println(myPrinter.getTonerLevel());
//        System.out.println(myPrinter.getPagesPrinted());

//        System.out.println(ihsan.getShirts().getBrands());
    }
}
