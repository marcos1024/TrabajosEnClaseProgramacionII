package Arrays;

import java.util.Scanner;

public class MaximoMinimo {
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

        int max = numeros[0];
        int min = numeros[0];

        // Se recorre para buscar el máximo y el mínimo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("\nEl valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);

        sc.close();
    }
}