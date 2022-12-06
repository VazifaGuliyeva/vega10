package org.example.entity;

public class Satici {
    private int id;
    private String ad;
    private String soyad;
    private String dogumTarixi;

    public Satici(int id, String ad, String soyad, String dogumTarixi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarixi = dogumTarixi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumTarixi() {
        return dogumTarixi;
    }

    public void setDogumTarixi(String dogumTarixi) {
        this.dogumTarixi = dogumTarixi;
    }

    @Override
    public String toString() {
        return "Satici{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumTarixi='" + dogumTarixi + '\'' +
                '}';
    }
}
