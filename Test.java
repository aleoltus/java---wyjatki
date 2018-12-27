package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        int zmienna;
        Scanner liczba = new Scanner(System.in);
        zmienna = liczba.nextInt();
        if(zmienna%2 == 0 ){
            System.out.println("liczba pazysta");
        }else {
            System.out.println("Liczba nieparzysta");
        }

        if(zmienna > 0 && zmienna <=10) {
            System.out.println("Liczba dodatnia i mniejsza od 10");
        }
            else{
                System.out.println("Liczba ujemna ");

            }
        }

    }

