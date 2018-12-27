package com.company;

public class Pracownik {
    String imie;
    String nazwisko;
    int wyplata;

    public Pracownik(){
        imie = "";
        nazwisko ="";
        wyplata = 0;
    }

    public Pracownik(String a,String b,int c){
        imie = a;
        nazwisko =b;
        wyplata =c;
    }
}
