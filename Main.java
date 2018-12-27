package com.company;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
		double liczba = 9.0;
		int b = 2;

		double pierwiastek = Math.sqrt(liczba);
		double potega = Math.pow(liczba, b);

		System.out.println("Pierwsiatek z liczby" +liczba+ " wynosi: " +pierwiastek);
		System.out.println("Potega liczby "+liczba+ " wynosi " +potega);

	}
}
