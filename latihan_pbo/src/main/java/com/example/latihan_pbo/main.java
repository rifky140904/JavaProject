package com.example.latihan_pbo;

import java.util.ArrayList;
import java.util.List;

abstract class Karyawan {
    String nama;
    double gaji;

    abstract double hitungGaji();
}

class Staf extends Karyawan{
    double biayaLembur;

    public Staf(String nama, double gaji, double biayaLembur){
        this.nama = nama;
        this.gaji = gaji;
        this.biayaLembur = biayaLembur;
    }

    @Override
    double hitungGaji(){
        return gaji + biayaLembur;
    }
}

class Manager extends Karyawan{
    double tunjangan;

    public Manager(String nama, double gaji, double tunjangan){
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    @Override
    double hitungGaji(){
        return gaji + tunjangan;
    }
}

class Perusahaan {
    String nama;
    List<Karyawan> karyawan;

    public Perusahaan(String nama){
        this.nama = nama;
        this.karyawan = new ArrayList<>();
    }

    public void addKaryawan(Karyawan karyawan){
        this.karyawan.add(karyawan);
    }

    public void distribusiGajiBulanan(){
        for (Karyawan karyawan : karyawan){
            System.out.println("Nama: " + karyawan.nama + " Gaji: " + karyawan.hitungGaji());
        }
    }
}

public class main {
    public static void main(String[] args){
        Perusahaan perusahaan = new Perusahaan("Sumber Jaya");

        Staf staf1 = new Staf("Rifky", 500000, 300000);
        Staf staf2 = new Staf("Budi", 400000, 250000);
        Manager manager1 = new Manager("Andrian", 800000, 500000);
        Manager manager2 = new Manager("Edo", 600000, 500000);

        perusahaan.addKaryawan(staf1);
        perusahaan.addKaryawan(staf2);
        perusahaan.addKaryawan(manager1);
        perusahaan.addKaryawan(manager2);

        perusahaan.distribusiGajiBulanan();
    }
}
