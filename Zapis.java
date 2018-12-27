package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println("Bardzo lubie moj komputer ");
        zapis.close();


    }
}
