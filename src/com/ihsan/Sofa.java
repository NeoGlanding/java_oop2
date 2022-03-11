package com.ihsan;

public class Sofa {
    public String type;
    public String materials;
    public String manufacture;

    public Sofa(String type, String materials, String manufacture) {
        this.type = type;
        this.materials = materials;
        this.manufacture = manufacture;
    }

    public String getType() {
        return type;
    }

    public String getMaterials() {
        return materials;
    }

    public String getManufacture() {
        return manufacture;
    }
}
