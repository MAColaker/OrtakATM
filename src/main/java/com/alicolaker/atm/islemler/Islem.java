package com.alicolaker.atm.islemler;

import com.alicolaker.atm.musteriler.Musteri;

public class Islem {
    public void paraCekme(Musteri musteri, double miktar) {
        musteri.setHesapBakiye(musteri.getHesapBakiye() - miktar);
        System.out.println(miktar + "₺ Tutarında para hesaptan çekilmiştir.");
        System.out.println("Güncel bakiye: " + musteri.getHesapBakiye() + "₺");
    }

    public void paraYatirma(Musteri musteri, double miktar) {
        musteri.setHesapBakiye(musteri.getHesapBakiye() + miktar);
        System.out.println(miktar + "₺ Tutarında para hesaba yatırılmıştır.");
        System.out.println("Güncel bakiye: " + musteri.getHesapBakiye() + "₺");
    }
}
