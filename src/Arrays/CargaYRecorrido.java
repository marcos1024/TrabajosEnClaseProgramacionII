package Arrays;

import java.util.Scanner;

public class CargaYRecorrido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos valores desea ingresar? ");
        int n = sc.nextInt();

        // Creamos el array
        int[] numeros = new int[n];
        int suma = 0;
        // Se carga el array
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        // Recorro el array
        System.out.println("\nValores ingresados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        System.out.printf("\nPromedio: %d\n", (suma/numeros.length));


        sc.close();
    }
}