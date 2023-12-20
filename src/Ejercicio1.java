import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Area de un círculo

        System.out.println("Calcule el Area de un circulo indicando su radio");
        final float PI = 3.14f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo: ");
        float radio = scanner.nextFloat();
        scanner.close();

        // Calculando el area

        float areaCirculo = (float) (PI * Math.pow(radio,2));

        System.out.println("El area del circulo es: " + areaCirculo);
    }


}
