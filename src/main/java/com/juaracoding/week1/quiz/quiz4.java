package com.juaracoding.week1.quiz;
import java.util.Scanner;

// Soal : Buatkan program input angka bebas, tetapi ketika input angka 0 keluar dari program, gunakan keyword break.
public class quiz4 {
    public static void main(String [] args) {
        Scanner inputAngka = new Scanner(System.in);
        do {
            // inisialisasi variable angka
            System.out.print("Masukan angka: ");
            int angka = inputAngka.nextInt();

            // decision if else untuk menentukan program dihentikan atau tidak berdasarkan input user.
            if (angka != 0) {
                System.out.println("Angka bukan 0, program tetap akan berjalan");
            } else {
                System.out.println("Angka adalah 0, program akan dihentikan");
                break;
            }
        } while (true);

        inputAngka.close();

    }
}
