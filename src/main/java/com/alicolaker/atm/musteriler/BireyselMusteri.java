package com.alicolaker.atm.musteriler;

public class BireyselMusteri extends Musteri {
    private String evAdres;

    public BireyselMusteri(int tcKimlikNo, String adSoyad, double hesapBakiye, String evAdres) {
        super(tcKimlikNo, adSoyad, hesapBakiye);
        this.evAdres = evAdres;
    }

    public String getEvAdres() {
        return evAdres;
    }

    public void setEvAdres(String evAdres) {
        this.evAdres = evAdres;
    }

}
