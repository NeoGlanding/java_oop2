package com.ihsan;

public class Room {
    private Sofa sofa;
    private String wallColor;

    public Room(Sofa sofa, String wallColor) {
        this.sofa = sofa;
        this.wallColor = wallColor;
    }

    public String getSofaManufacturer() {
        return sofa.manufacture;
    }

    private Sofa getSofaFromSofa() {
        return sofa;
    }

    public String getWallColor() {
        return wallColor;
    }
}
