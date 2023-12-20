import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Volumen de una esfera

        System.out.println("Calculo del Volumen de una Esfera");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la esfera: ");
        float radio = scanner.nextFloat();
        scanner.close();

        // Calculo del volumen
        final float PI = 3.14f;
        float volumenEsfera = (float) (4 * PI * Math.pow(radio,3))/3;
        System.out.println("El volumen de la esfera con radio " + radio + " es " + volumenEsfera);

    }
}
