package com.juaracoding.week1.quiz.ifjava;

import java.util.Scanner;

public class cobaSwitch {
    public static void main(String[] args){

        Scanner inputBrowser = new Scanner(System.in);
        System.out.print("Masukan browser: ");

        String pilihBrowser = inputBrowser.nextLine();

        switch (pilihBrowser) {
            case "Chrome":
                System.out.println("Open Browser Chrome");
                break;
            case "Firefox":
                System.out.println("Open Browser Firefox");
                break;
            default:
                System.out.println("Bukan browser");

        }
    }
}
