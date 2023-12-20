import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Conversion de monedas

        final float tipoCambioDolarEuro = 0.91f;
        final float tipoCambioEuroDolar = 1.10f;

        // Logica de conversion
        boolean bool = true;
        while (bool) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¿ Que conversion desea realizar (Dolar-Euro = 1 , Euro-Dolar = 2)? [Escoja una opcion 1 o 2]: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el monto en dolares: ");
                float cantidadDolares = scanner.nextFloat();
                float conversionDolarEuro = cantidadDolares * tipoCambioDolarEuro;
                System.out.println("La conversion de Dolar a Euro de " + cantidadDolares + " dolares es: " + conversionDolarEuro + " euros.");
                bool = false;
            } else if (opcion == 2) {
                System.out.print("Ingrese el monto en euros: ");
                float cantidadEuros = scanner.nextFloat();
                float conversionEuroDolar = cantidadEuros * tipoCambioEuroDolar;
                System.out.println("La conversion de Euro a Dolar de " + cantidadEuros + " euros es: " + conversionEuroDolar + " dolares.");
                bool = false;
            } else {
                System.out.println("Opcion no valida");
            }
        }


    }
}
