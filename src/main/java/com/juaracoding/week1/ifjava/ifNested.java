package com.juaracoding.week1.ifjava;

import java.util.Scanner;

public class ifNested {
    public static void main(String[] args) {
//        Scanner inputUsia = new Scanner(System.in);
//        System.out.print("Masukan Usia Anda: ");
//        int usia = inputUsia.nextInt();
//
//        if (usia >= 17 && usia <= 55) {
//            Scanner inputBeratBadan = new Scanner(System.in);
//            System.out.print("Masukan Berat Badan Anda: ");
//            int beratBadan = inputBeratBadan.nextInt();
//
//            if(beratBadan >= 60){
//                System.out.println("Anda memenuhi kriteria untuk donor danar");
//            } else {
//                System.out.println("Berat badan anda tidak mencukupi kriteria");
//            }
//        } else if (usia >= 56) {
//            System.out.println("Usia anda terlalu tua untuk melakukan donor darah");
//        } else {
//            System.out.println("Usia anda terlalu muda untuk melakukan donor darah");
//        }

        //buatkan sistem ganjil genap

        Scanner inputTanggal = new Scanner(System.in);
        System.out.print("Masukan Tanggal: ");
        int Tanggal = inputTanggal.nextInt();

        Scanner inputPlatNomor = new Scanner(System.in);
        System.out.print("Masukan Plat Nomor Anda Anda: ");
        int platNomor = inputPlatNomor.nextInt();

        if ( Tanggal % 2 == 0) {
            if (platNomor % 2 == 0){
                System.out.println("Plat dan tanggal anda genap, Anda Bisa lewat jalan Soekarno-Hatta");
            }else {
                System.out.println("Plat ganjil tidak bisa lewat pada tanggal genap");
            }
        } else if (Tanggal % 2 == 1) {
            if (platNomor % 2 == 1) {
                System.out.println("Plat dan tanggal anda ganjil, Anda Bisa lewat jalan Soekarno-Hatta");
            } else {
                System.out.println("Plat genap tidak bisa lewat pada tanggal ganjil");
            }
        } else {
            System.out.println("Plat anda tidak sesuai dengan tanggal ganjil genap");
        }
    }
}