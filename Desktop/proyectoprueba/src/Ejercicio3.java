import java.util.Scanner;

public class Ejercicio3{

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Introduce el radio del circulo");
        a = entrada.nextInt();

        System.out.println("Introduce el radio del circulo");
        b = entrada.nextInt();

        c = a + b + a + b; 
         
        
        System.out.println("El área del rectángulo es " + c );
        }
}
