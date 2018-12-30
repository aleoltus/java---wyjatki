package com.company;

public class Shop{
    public static void main(String args[]) {
        Product product1 = new Product("kubek", 5);
        Product product2 = new Product("kubek", 5);

        System.out.print(product1 == product2); //false
        System.out.println(product1.equals(product2)); //false

        System.out.println("10 == 10" + (10 == 10) );
        System.out.println("10 != 10" + (10 != 10) );
        //equals .
        System.out.println(product1.equals(product2));
        System.out.println(product2.equals(product1));
    }
}
