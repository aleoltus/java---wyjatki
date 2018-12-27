import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class imie{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String imie = input.nextLine();

        PrintWriter zapis = new PrintWriter("imie.txt");
        zapis.print(imie);
        zapis.close();

        Scanner odczyt = new Scanner(new File("imie.txt"));
        System.out.println(odczyt.nextLine());
    }
}