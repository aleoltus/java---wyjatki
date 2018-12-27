package com.company;

public class Firma {
    public static void main(String args[]){
        Pracownik pracownik = new Pracownik("Ola", "O" ,3000);
        System.out.println("Pracownik: "+pracownik.imie+", " +pracownik.nazwisko+ ","+pracownik.wyplata);
        Szef szef = new Szef();
        szef.imie = "Wlodek";
        szef.nazwisko = "Zieba";
        szef.wyplata = 4000;
        szef.premia = 2000;

        System.out.println("Szef: "+szef.imie+", " +szef.nazwisko+ ","+szef.wyplata+ ","+szef.premia);


    }
}
