package com.juaracoding.array;

public class lengthFruitName {
    public static void main(String[] args) {
        String[] buah = {"nanas","apel","jeruk","pisang","semangka"};

        String namaTerpanjang = "";

        for (String namaBuah : buah) {
            namaTerpanjang = namaBuah.length() > namaTerpanjang.length() ? namaBuah : namaTerpanjang;
        }

        System.out.println("Nama buah dari array yang diberikan adalah: " + namaTerpanjang);
    }
}
