import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        /*
        String nombre;
        System.out.println("Por favor diganos su nombre: ");
        nombre = escaner.nextLine();
        System.out.println("Genial, tu nombre es: " + nombre);
        */

        int num1, num2;
        System.out.println("Digite el primer numero a operar: ");
        num1 = escaner.nextInt();
        System.out.println("Digite el segundo numero: ");
        num2 = escaner.nextInt();
        // System.out.println("Numero 1 me dijiste: " + num1);
        // System.out.println("Numero 2 me dijiste: " + num2);
        int suma, resta, producto;
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La resta entre numero 1 y numero 2 es: " + resta);
        System.out.println("La multiplicacion entre numero 1 y numero 2 es: " + producto);
    }
}