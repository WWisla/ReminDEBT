package com.example.anna.testapplicationremindebt;

import java.util.Date;
import java.io.Serializable;

public class Zobowiazanie implements Serializable {
    private  String nazwa, waluta;
    private Podmiot podmiot;
    private Date data;
    private double kwota;

    public Zobowiazanie(String nazwa, Podmiot podmiot, Date data, double kwota, String waluta) {
        this.data = data;
        this.kwota = kwota;
        this.nazwa = nazwa;
        this.podmiot = podmiot;
        this.waluta = waluta;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getKwota() {
        return kwota;
    }

    public Date getData() {
        return data;
    }

    public String getWaluta() {
        return waluta;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}

