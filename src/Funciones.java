import java.util.Scanner;
public class Funciones {

    public static void mostrarMenu() {
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Mostrar fecha del sistema");
        System.out.println("3. Mostrar mensaje");
        System.out.println("0. Salir");
    }

    public static void sumar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese B: ");
        int b = sc.nextInt();
        System.out.println("Resultado: " + (a + b));
    }

    public static void mostrarFecha() {
        System.out.println("Fecha actual: " + java.time.LocalDate.now());
    }

    public static void imprimirMensaje(String t) {
        System.out.println(t);
    }
}