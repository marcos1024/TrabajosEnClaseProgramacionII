package EjerciciosSimples;

import java.util.Scanner;

public class Ejercicios {
    public static void ejercicio1(){
        int a = 5;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
    }
    public static void ejercicio2(){
        int x = 10;
        x = x + 3;
        x = x - 4;

        System.out.println(x);
    }
    public static void ejercicio3(){
        String nombre = "Ana";
        int edad = 14;

        System.out.println(nombre.length());
        System.out.println(edad);
        System.out.println(nombre + " tiene " + edad + " años");
    }
    public static void ejercicio4(){
        int numero = 7;

        if (numero > 5) {
            System.out.println("Mayor que 5");
        }

        System.out.println("Fin");
    }
    public static void ejercicio5(){
        int numero = 3;

        if (numero > 5) {
            System.out.println("Mayor");
        } else {
            System.out.println("Menor o igual");
        }
    }
    public static void calculadoraBasica(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        scanner.close();
    }
    public static void conversionTemperatura(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversión de Temperatura");
        System.out.println("1 - Celsius a Fahrenheit");
        System.out.println("2 - Fahrenheit a Celsius");

        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {

            System.out.print("Ingrese la temperatura en Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Resultado: " + fahrenheit + " °F");

        } else if (opcion == 2) {

            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("Resultado: " + celsius + " °C");

        } else {
            System.out.println("Opción inválida");
        }



        scanner.close();
    }

}
