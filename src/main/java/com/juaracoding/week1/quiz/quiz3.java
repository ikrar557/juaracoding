package com.juaracoding.week1.quiz;

import java.util.Scanner;

// Soal: Buatkan program harga tiket masuk bioskop Weekday Rp. 30.000 tetapi Weekend Rp. 45.000, menggunakan keyword continue
public class quiz3 {
    public static void main (String [] args) {
        // Inisialisasi variable tiket
        int hargaWeekday = 30000;
        int hargaWeekend = 45000;

        Scanner inputHari = new Scanner(System.in);
        while (true) {

            System.out.print("Masukkan hari: ");

            String hari = inputHari.nextLine();

            switch (hari.toLowerCase()){
                // menghilangkan redudansi pada case.
                case "senin":
                case "selasa":
                case "rabu":
                case "jumat":
                    System.out.println("Harga tiket anda adalah Rp. " + hargaWeekday);
                    break;
                case "sabtu":
                case "minggu":
                    System.out.println("Harga tiket anda adalah Rp. " + hargaWeekend);
                    break;
                default:
                    System.out.println("Salah memasukan inputan, harap masukan kata berikut:" +
                            "\nsenin" + "\nselasa" + "\nrabu" + "\nkamis" + "\njumat" + "\nsabtu" + "\nminggu");
                    continue;
            }
            break;
        }

        inputHari.close();

    }
}
