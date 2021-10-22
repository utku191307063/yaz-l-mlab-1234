package com.example.myapplication2;

public class kayıtekleme {
    String Ad, Soyad, Numara, Tc, Adres, Mail, Telnumrasi, Sifre;

    public kayıtekleme() {
    }

    public kayıtekleme(String ad, String soyad, String numara, String tc, String adres, String mail, String telnumrasi, String sifre) {
        this.Ad = ad;
        this.Soyad = soyad;
        this.Numara = numara;
        this.Tc = tc;
        this.Adres = adres;
        this.Mail = mail;
        this.Telnumrasi = telnumrasi;
        this.Sifre = sifre;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getNumara() {
        return Numara;
    }

    public void setNumara(String numara) {
        Numara = numara;
    }

    public String getTc() {
        return Tc;
    }

    public void setTc(String tc) {
        Tc = tc;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getTelnumrasi() {
        return Telnumrasi;
    }

    public void setTelnumrasi(String telnumrasi) {
        Telnumrasi = telnumrasi;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String sifre) {
        Sifre = sifre;
    }
}