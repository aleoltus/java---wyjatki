import java.util.Scanner;

public class Odczyttab {
    public static void main(String args[]){
        int tab[] = {1,2,3,4,5};
        Scanner input = new Scanner(System.in);
        System.out.println("Podal index tablicy ");
        int in = input.nextInt();
        System.out.println("Index: "+tab[in]);


    }

}
