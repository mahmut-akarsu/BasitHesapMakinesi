package com.yatutarsa.pratikprojeleri;

public class Hesapla {


    private int sayi1,sayi2;
    Hesapla(int sayi1,int sayi2){
        this.sayi1=sayi1;
        this.sayi2=sayi2;

    }

    public  int toplama(){
        return (sayi1+sayi2);
    }

    public int cikarma(){
        return sayi1-sayi2;
    }

    public int bolme(){
        return sayi1/sayi2;
    }

    public int carpma(){
        return sayi1*sayi2;
    }

    public int getSayi1() {
        return sayi1;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public double getSayi2() {
        return sayi2;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }
}
