import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        SumaHastaCero();
//        ContadorDesdeCeroHastaNro();
//        SumaHastaCero2();
//        TablaMultiplicacionConValidación();
        AdivinarNumero();
    }

    public static void SumaHastaCero() {
        Scanner input = new Scanner(System.in);

        int numero = 1; // inicializo distinto de 0
        int suma = 0;

        while (numero != 0) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();

            suma = suma + numero;
        }

        System.out.println("La suma total es: " + suma);

        input.close();
    }

    public static void ContadorDesdeCeroHastaNro() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();

        int contador = 0;

        while (contador <= numero) {
            System.out.print(contador + " ");
            contador++;
        }

        input.close();
    }

    public static void SumaHastaCero2() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int numero = input.nextInt();

        int suma = 0;
        suma += numero;
        while (numero != 0) {
            System.out.printf("Ingrese un numero: ");
            numero = input.nextInt();
            suma += numero;
        }
        System.out.printf("La suma total es: " + suma);
    }

    public static void TablaMultiplicacionConValidación() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Error: el número no puede ser negativo.");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        input.close();
    }

    public static void AdivinarNumero() {
        Scanner input = new Scanner(System.in);

        int numeroSecreto = 7;
        //int numeroSecreto = (int)(Math.random() * 10) + 1;
        int intento = 0;
        int aux = 5;

        while ((intento != numeroSecreto) && (aux != 0)) {

            System.out.print("Adivine el número: ");
            intento = input.nextInt();
            aux--;
            if (intento < numeroSecreto) {
                System.out.println("Muy bajo");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto");
            } else {
                System.out.println("Correcto");
            }
        }

        input.close();
    }
}