package com.alicolaker.atm.musteriler;

public class KurumsalMusteri extends Musteri{
    private String sirketAd;

    public KurumsalMusteri(int tcKimlikNo, String adSoyad, double hesapBakiye, String sirketAd) {
        super(tcKimlikNo, adSoyad, hesapBakiye);
        this.sirketAd = sirketAd;
    }

    public String getSirketAd() {
        return sirketAd;
    }

    public void setSirketAd(String sirketAd) {
        this.sirketAd = sirketAd;
    }
}
