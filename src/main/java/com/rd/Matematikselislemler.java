package com.rd;

public class Matematikselislemler {
    public static double karekokHesapla(double sayi) throws NegatifSayiException {
        if (sayi < 0) {
            throw new NegatifSayiException("Negatif sayıların karekökü alınamaz: " + sayi);
        }
        return Math.sqrt(sayi);
    }
}