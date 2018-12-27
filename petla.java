package com.company;

import java.util.Scanner;

public class petla {
    public static void main(String[] args){
       /* int licznik = 0;

        while(licznik<10){
            System.out.println("To jest licznik ");
            licznik++;

        }
        */
        System.out.println("Koniec petli while");
        int liczba =2;

       /* do{
            System.out.println("To jest liczba");
            liczba++;
        }while(liczba<8);
        System.out.println("Koniec petli do while");
        */
        int a;
        System.out.print("Podaj liczbe" );
        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();
        for(int i = a; i > 0 ; i--) {
            System.out.println(i);
        }
        System.out.print("Wybuch");
    }
}
