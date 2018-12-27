package com.company;
import java.lang.String;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import static java.lang.System.out;

public class odczyt {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("ala.txt");
        Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        System.out.println(zdanie);

    }

}
