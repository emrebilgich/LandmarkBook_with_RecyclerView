package com.bilgic.landmarkbook;

public class Singleton {

    private static Singleton instance;
    private Landmark selectedLandmark;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Landmark getSelectedLandmark() {
        return selectedLandmark;
    }

    public void setSelectedLandmark(Landmark selectedLandmark) {
        this.selectedLandmark = selectedLandmark;
    }
}
