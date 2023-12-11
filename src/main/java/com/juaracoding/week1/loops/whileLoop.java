package com.juaracoding.week1.loops;

public class whileLoop {
    public static void main(String[] args){
        // use "while" when you unsure how many times you want to loop

//        Pengecekan kondisi dilakukan sebelum iterasi pertama,
//        Jika kondisi awal salah, maka iterasi tidak dijalankan.
//        int x = 0;
//
//        while (x < 5) {
//            x++;
//            System.out.println("Nilai x sekarang: " + x);
//        }

//        Iterasi pertama dijalankan tanpa melihat kondisi,
//        Kondisi diperiksa setelah iterasi pertama dijalankan,
//        int y = 0;
//
//        do {
//            System.out.println("Nilai y sekarang: " + y);
//            y++;
//        } while (y < 5);

        int jumlahAnak = 3;

        do {

            jumlahAnak ++;

        }while(jumlahAnak<=2);

        System.out.print("Jumlah anak sekarang = "+jumlahAnak);
    }
}
