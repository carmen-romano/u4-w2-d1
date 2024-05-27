package Esercizio2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class KmPercorsi {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Inserisci il numero di km percorsi: ");
            int kmPercorsi = scanner.nextInt();

            System.out.print("Inserisci il numero di litri consumati: ");
            int litriConsumati = scanner.nextInt();


            System.out.println("Km per litro percorsi: " + kmPercorsi/ litriConsumati);
        } catch (ArithmeticException ex) {
            System.err.println("Errore: Inserisci un valore diverso da zero");
        } catch (InputMismatchException ex) {
            System.err.println("inserisci un numero!");
        }
    }
}


