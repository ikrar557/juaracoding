package com.juaracoding.ifjava;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
//      Ternary operator hanyalah 'Short-Hand' untuk program simple if-else
        Scanner inputWaktu = new Scanner(System.in);
        System.out.print("Masukan waktu yang anda inginkan: ");

//       variable = (condition) ? expressionTrue : expressionFalse
        int waktu = inputWaktu.nextInt();

        String hasil = (waktu < 18) ? "Sore Hari." : "Malam Hari.";
        System.out.println(hasil);
    }
}
