package com.company;
import java.util.Scanner;
public class dodawanie {
    public static void main(String[] args){
        int a,b;
        Scanner oa = new Scanner(System.in);
        Scanner ob = new Scanner(System.in);

        a = oa.nextInt();
        b = ob.nextInt();
        int c =a+b;

        System.out.println("Suma a + b równa się "+c);

    }
}
