package com.bilgic.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {
    private final String name;
    private final String country;
    private final int image;

    public Landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getImage() {
        return image;
    }
}
