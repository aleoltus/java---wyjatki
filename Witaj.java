package com.company;
import java.util.Scanner;

public class Witaj {
    public static void main(String[] args){
        String imie;
        Scanner odczyt = new Scanner(System.in);
        imie = odczyt.nextLine();

        System.out.println("Hej hej "+imie);
    }
}
