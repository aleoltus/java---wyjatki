package com.company;

import java.util.Scanner;

public class TestPunkty2D3D {
    public static void main(String args[]){
        Punkt2D punkt = new Punkt2D(2,3);
        Punkt3D punkt3D= new Punkt3D();
        System.out.println("Nasz punkt ma wspolrzedne x: "+punkt.a+ " y: "+punkt.b);
        System.out.println("Podaj wpolrzedna z ");
        Scanner odczyt = new Scanner(System.in);
        punkt3D.c = odczyt.nextInt();

        System.out.println("Nasz punkt ma wspolrzedne x:"+punkt3D.a+ " y:"+punkt3D.b+" z:"+punkt3D.c);

    }
}
