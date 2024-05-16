package com.example.latihan_pbo;

abstract class Rekening {
    String nama;
    double saldo;

    public Rekening(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public void simpan(double jumlah) {
        saldo += jumlah;
    }

    public abstract void ambil(double jumlah);

    public void cetak() {
        System.out.println("Saldo anda: " + saldo);
    }
}

class Tabungan extends Rekening {
    public Tabungan(String nama, double saldo) {
        super(nama, saldo);
    }

    @Override
    public void ambil(double jumlah) {
        if (saldo - jumlah >= 0) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo Tidak Mencukupi");
        }
    }
}

class Deposito extends Rekening {
    public Deposito(String nama, double saldo) {
        super(nama, saldo);
    }

    @Override
    public void ambil(double jumlah) {
        if (saldo - jumlah >= 0) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo Tidak Mencukupi");
        }
    }
}

public class main2 {
    public static void main(String[] args) {
        Rekening tabungan = new Tabungan("Rifky", 900000);
        Rekening deposito = new Deposito("Rifky", 200000);

        tabungan.simpan(50000);
        tabungan.cetak();

        tabungan.ambil(700000);
        tabungan.cetak();

        tabungan.ambil(300000);
        tabungan.cetak();

        deposito.ambil(200000);
        deposito.cetak();

        deposito.simpan(300000);
        deposito.cetak();
    }
}
