import java.lang.*;
import java.util.Random;
import java.util.Scanner;

public class Rando {
    public static void main (String args[]) {
        generate_intro();
        generate_rando();
    }

    public static void generate_intro() {
        System.out.println("\nHello! Click \"enter\" to generate random password:");
    }

    public static void generate_rando() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        input.nextLine();
        input.close();
        System.out.print("Password:  ");
        for (int i = 0; i < 15; i++) {
            System.out.print((char)(rand.nextInt(93) + 33));
        }
        System.out.println("\n");
        
    }
}