package com.juaracoding.week1.quiz;
import java.util.Scanner;
// input: 2
//        10000

// output: QTY = 2
//         Harga = 10000.0
//         Jumlah = 20000.0

// Asumsi : Soal dibuat untuk mengasah kemampuan peserta tentang tipe data dan operator terutama double/float, dan operator perkalian (*).
public class quiz1 {
    public static void main(String [] args){
        // Inisiasi variable jumlah
        Scanner inputQuantity = new Scanner(System.in);
        System.out.print("Masukkan jumlah: ");

        int quantity  = inputQuantity.nextInt();

        // Inisiasi variable harga.
        Scanner inputHarga = new Scanner(System.in);
        System.out.print("\nMasukan harga: ");

        double harga = inputHarga.nextDouble();

        // Menghitung jumlah dari quantity * harga
        double jumlah = quantity * harga;

        // Output program
        System.out.println("Quantity Barang: " + quantity);
        System.out.println("Harga Barang " + "Rp. " + harga);
        System.out.println("Jumlah Total " + "Rp. " + jumlah);

    }
}
