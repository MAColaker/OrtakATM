package com.alicolaker.atm;

import com.alicolaker.atm.islemler.Islem;
import com.alicolaker.atm.musteriler.BireyselMusteri;
import com.alicolaker.atm.musteriler.KurumsalMusteri;
import com.alicolaker.atm.musteriler.Musteri;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hoş Geldiniz");

        Musteri bireyselMusteri1 = new BireyselMusteri(123, "Ayşe Hatun", 150.05, "İstanbul");
        Musteri bireyselMusteri2 = new BireyselMusteri(231, "Hakkı Dayı", 700, "Ankara");
        Musteri bireyselMusteri3 = new BireyselMusteri(312, "Mücahit Köklü", 200.0, "Amasya");
        Musteri kurumsalMusteri1 = new KurumsalMusteri(213, "Melih Sakarya", 15000.75, "Saha Bilgi");
        Musteri kurumsalMusteri2 = new KurumsalMusteri(132, "Mehmet Akşahin", 10000, "Testinium");

        HashMap<Integer, Musteri> musteriler = new HashMap<>();
        musteriler.put(1, bireyselMusteri1);
        musteriler.put(2, bireyselMusteri2);
        musteriler.put(3, bireyselMusteri3);
        musteriler.put(4, kurumsalMusteri1);
        musteriler.put(5, kurumsalMusteri2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("0: Çıkış");
            System.out.print("Müşteri numarasını giriniz: ");
            int musteriNo;

            try {
                musteriNo = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş");
                scanner = new Scanner(System.in);
                continue;
            }

            if (musteriler.get(musteriNo) == null) {
                if (musteriNo == 0)
                    break;
                System.out.println("Müşteri bilgisi bulunamadı");
            } else {
                Musteri musteri = musteriler.get(musteriNo);

                System.out.println("Müşteri TC No: " + musteri.getTcKimlikNo());
                System.out.println("Müşteri Ad Soyad: " + musteri.getAdSoyad());
                System.out.println("Müşteri Hesap Bakiyesi: " + musteri.getHesapBakiye() + "₺");

                if (musteri instanceof BireyselMusteri) {
                    System.out.println("Müşteri Adresi: " + ((BireyselMusteri) musteri).getEvAdres());
                } else {
                    System.out.println("Müşteri Şirket Adı: " + ((KurumsalMusteri) musteri).getSirketAd());
                }

                boolean kontrol = true;
                while (kontrol) {
                    System.out.println("0: Çıkış, 1: Para Yatırma, 2: Para Çekme");
                    System.out.print("İşlem Seçiniz: ");
                    int secilenIslem;
                    try {
                        secilenIslem = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Geçersiz giriş");
                        scanner = new Scanner(System.in);
                        continue;
                    }
                    double miktar;

                    Islem islem = new Islem();

                    switch (secilenIslem) {
                        case 0:
                            kontrol = false;
                            break;
                        case 1:
                            System.out.print("Miktar giriniz: ");
                            miktar = scanner.nextDouble();
                            islem.paraYatirma(musteri, miktar);
                            kontrol = false;
                            break;
                        case 2:
                            System.out.print("Miktar giriniz: ");
                            miktar = scanner.nextDouble();
                            islem.paraCekme(musteri, miktar);
                            kontrol = false;
                            break;
                        default:
                            System.out.println("Yanlış işlem");
                    }
                }
            }
        }
    }
}