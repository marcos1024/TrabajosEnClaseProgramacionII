package Arrays;

import java.util.Scanner;

public class Conteos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números desea ingresar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        // Se carga el array
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int positivos = 0;
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            }
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("\nCantidad de positivos: " + positivos);
        System.out.println("Cantidad de pares: " + pares);

        sc.close();
    }
}