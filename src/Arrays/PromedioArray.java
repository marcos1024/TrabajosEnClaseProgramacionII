package Arrays;

import java.util.Scanner;

public class PromedioArray {
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

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;
        System.out.println("\nLa suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}