import java.util.Scanner;

public class Odczyttab {
    public static void main(String args[]){
        int tab[] = {1,2,3,4,5};
        Scanner input = new Scanner(System.in);
        int in = -1;
        System.out.println("Podal index tablicy ");
        in = input.nextInt();

        System.out.println("Index: "+tab[in]);

        try{
            System.out.println(tab[in]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Niepoprawny rozmiar tablicy/ za duzo "+tab.length);
        }


    }

}
