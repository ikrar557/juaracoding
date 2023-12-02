package com.juaracoding.week1.quiz.quiz;
// Buatkan program cari kata terpanjang dari data buah berikut
// String[] buah = {"nanas","apel","jeruk","pisang","semangka"};

public class quiz5 {
    public static void main(String[] args) {
        // Inisialisasi array
        String[] buah = {"nanas","apel","jeruk","pisang","semangka"};

        String namaTerpanjang = "";

        for (String namaBuah : buah) {
            // Menggunakan operator ternary atau short hand dari simple if else untuk mencari nama terpanjang.
            namaTerpanjang = namaBuah.length() > namaTerpanjang.length() ? namaBuah : namaTerpanjang;
        }

        System.out.println("Nama buah dari array yang diberikan adalah: " + namaTerpanjang);
    }
}
