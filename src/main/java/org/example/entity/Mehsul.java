package org.example.entity;

public class Mehsul {
    private int mehsulId;
    private String kateqoriya;
    private double qiymet;
    private String satici;
    private int puan;
    private String marka;

    public Mehsul(int mehsulId, String kateqoriya, double qiymet, String satici, int puan, String marka) {
        this.mehsulId = mehsulId;
        this.kateqoriya = kateqoriya;
        this.qiymet = qiymet;
        this.satici = satici;
        this.puan = puan;
        this.marka = marka;
    }

    public int getMehsulId() {
        return mehsulId;
    }

    public void setMehsulId(int mehsulId) {
        this.mehsulId = mehsulId;
    }

    public String getKateqoriya() {
        return kateqoriya;
    }

    public void setKateqoriya(String kateqoriya) {
        this.kateqoriya = kateqoriya;
    }

    public double getQiymet() {
        return qiymet;
    }

    public void setQiymet(double qiymet) {
        this.qiymet = qiymet;
    }

    public String getSatici() {
        return satici;
    }

    public void setSatici(String satici) {
        this.satici = satici;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Mehsul{" +
                "mehsulId=" + mehsulId +
                ", kateqoriya='" + kateqoriya + '\'' +
                ", qiymet=" + qiymet +
                ", satici='" + satici + '\'' +
                ", puan=" + puan +
                ", marka='" + marka + '\'' +
                '}';
    }
}
