package com.juaracoding.week1.quiz.array;

public class basicArray {
    public static void main (String [] args){
        System.out.println("===== Array with multiple-line =====");
        int a[] = new int[5]; //declaration and instantiation
        a[0] = 10; //initialization
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        //traversing array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("===== Array in Single-Line =====");
        int b[] = {1,3,5,}; //declaration, instantiation and initialization in single line
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }

        // for-each loop
        System.out.println("\n===== For-Each Loop =====");
        int c[] = {33, 66, 99, 122};
        for (int element:c)
        System.out.println(element);
    }

}
