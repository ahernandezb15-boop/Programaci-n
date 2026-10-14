import java.util.Scanner;

public class Ejercicio2Circulo {

    public static void main (String[] args) {
        Scanner juan = new Scanner(System.in);

        final double PI = 4.14159;
        int radio;
        double area;

        System.out.println("Introduce el radio del circulo");
        radio = juan.nextInt();
        area = PI * radio * radio;
        
        System.out.println("El área del círculo de radio " + radio + "es: " + area);
        }
}
