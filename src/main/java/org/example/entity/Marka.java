package org.example.entity;

public class Marka {

    private int markaId;
    private String markaAd;

    public Marka(int markaId, String markaAd) {
        this.markaId = markaId;
        this.markaAd = markaAd;
    }

    public int getMarkaId() {
        return markaId;
    }

    public void setMarkaId(int markaId) {
        this.markaId = markaId;
    }

    public String getMarkaAd() {
        return markaAd;
    }

    public void setMarkaAd(String markaAd) {
        this.markaAd = markaAd;
    }

    @Override
    public String toString() {
        return "Marka{" +
                "markaId=" + markaId +
                ", markaAd='" + markaAd + '\'' +
                '}';
    }
}
