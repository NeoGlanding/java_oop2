package com.ihsan;

public class Printer {
    private int tonerLevel;
    private String name;
    private int pagesPrinted;

    public Printer(int tonerLevel, String name) {
        setTonerLevel(tonerLevel);
        setName(name);
        this.pagesPrinted = 0;
    }

    public void setTonerLevel(int tonerLevel) {
        if (tonerLevel > 100 || tonerLevel < 1) {
            System.out.println("Invalid toner value, it should be in range 1 and 100");
        } else {
            this.tonerLevel = tonerLevel;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPagesPrinted(int pagesPrinted) {
        if (this.tonerLevel - pagesPrinted <= 0) {
            System.out.println("Not enough toner");
        } else {
            setTonerLevel(this.tonerLevel - pagesPrinted);
            this.pagesPrinted += pagesPrinted;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public String getName() {
        return name;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
