package com.alicolaker.atm.musteriler;

public class Musteri {
    private int tcKimlikNo;
    private String adSoyad;
    private double hesapBakiye;

    public Musteri(int tcKimlikNo, String adSoyad, double hesapBakiye) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiye = hesapBakiye;
    }

    public int getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(int tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public double getHesapBakiye() {
        return hesapBakiye;
    }

    public void setHesapBakiye(double hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
    }
}
