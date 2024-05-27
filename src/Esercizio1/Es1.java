package Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeriCasuali = new int[5];
        Random random = new Random();

        for (int i = 0; i < numeriCasuali.length; i++) {
            numeriCasuali[i]=  random.nextInt(1,10);
            System.out.println(numeriCasuali[i]);
        }
        while (true) {
            System.out.println("Scegli un numero da inserire nell'array, 0 per uscire");
            int sceltaNumero = scanner.nextInt();
            if (sceltaNumero == 0) {
                break;
            }
            System.out.println("In che posizione vuoi inserirlo");
            int sceltaPosizione = scanner.nextInt();
            if (sceltaPosizione >= 0 && sceltaPosizione <= 4) {
                numeriCasuali[sceltaPosizione] = sceltaNumero;
                System.out.println("Array corrente: "+ Arrays.toString(numeriCasuali));
            } else {
                System.out.println("Scelta non valida. Inserisci un numero da 0 a 4 ");
            }
        }

        scanner.close();
    }

    }

