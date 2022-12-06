package org.example.entity;

public class Kateqoriya {
    private int kateqoriyaId;
    private String kateqoriyaAd;

    public Kateqoriya(int kateqoriyaId, String kateqoriyaAd) {
        this.kateqoriyaId = kateqoriyaId;
        this.kateqoriyaAd = kateqoriyaAd;
    }

    public int getKateqoriyaId() {
        return kateqoriyaId;
    }

    public void setKateqoriyaId(int kateqoriyaId) {
        this.kateqoriyaId = kateqoriyaId;
    }

    public String getKateqoriyaAd() {
        return kateqoriyaAd;
    }

    public void setKateqoriyaAd(String kateqoriyaAd) {
        this.kateqoriyaAd = kateqoriyaAd;
    }

    @Override
    public String toString() {
        return "Kateqoriya{" +
                "kateqoriyaId=" + kateqoriyaId +
                ", kateqoriyaAd='" + kateqoriyaAd + '\'' +
                '}';
    }
}
