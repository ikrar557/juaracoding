package com.juaracoding.week1.quiz;
import java.util.Scanner;
// Input: Java Juara
// Result: - 10
//         - JAVA JUARA
//         - java juara
//         - ara

// Asumsi: Soal ini dibuat untuk mengasah kemampuan peserta mengenai modifikasi pada tipe data String.
public class quiz2 {
    public static void main(String [] args){
        // Inisiasi variable kata
        Scanner inputKata = new Scanner(System.in);
        System.out.print("Masukan Kata: ");

        String kata = inputKata.nextLine();

        // Output program yang sudah di modifikasi sesuai dengan soal.
        System.out.println(kata.length());
        System.out.println(kata.toUpperCase());
        System.out.println(kata.toLowerCase());
        System.out.println(kata.substring(7, 10));
    }
}
