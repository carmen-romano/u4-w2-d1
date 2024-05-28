package Esercizio0;

import java.util.Scanner;

public class Debugger {
    public static void main(String[] args) {
        int[] numeri={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]); }

            Scanner scanner = new Scanner(System.in);

            int numero = scanner.nextInt();

            System.out.println("Hai inserito il numero: " + numero);

            scanner.close();
        }
    }

