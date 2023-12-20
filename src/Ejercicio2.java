import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Conversion de temperatura
        System.out.println("Conversion de temperatura [C -> F]");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celcius: ");
        float tempCelsius = scanner.nextFloat();
        scanner.close();

        // Conversion
        float tempFarenheit = (9 * tempCelsius)/5 + 32;
        System.out.println("La temperatura en Farenheit (F) es: " + tempFarenheit);

    }
}
