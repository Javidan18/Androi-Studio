package com.example.myapplication1;

public class Hesapla {
    private final int gelensayi1;
    private final int gelenSayi2;

    public Hesapla(int gelensayi1, int gelenSayi2) {
        this.gelensayi1 = gelensayi1;
        this.gelenSayi2 = gelenSayi2;
    }

    public int toplam(){
         return gelensayi1 + gelenSayi2;

    }
    public int fark(){
        return gelensayi1 - gelenSayi2;
    }
    public int bolum(){
        return  gelensayi1 / gelenSayi2;

    }
    public int carpim(){
        return gelensayi1 * gelenSayi2;

    }
}

