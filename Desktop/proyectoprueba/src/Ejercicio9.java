import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        int número = 2;
        int cuadrado;
        int cubo;
        int elevado4;

        System.out.println("Introduce un numerin");
        número = entrada.nextInt();
        

        cuadrado = (int) Math.pow(número, 2);
        cubo = (int) Math.pow(número, 3);
        elevado4 = (int) Math.pow(número, 4);

        System.out.println("La raíz cuadrada es: " + cuadrado);
        System.out.println("La raíz cúbica es: " + cubo);
        System.out.println("La elevación a 4 es: " + elevado4);


    }
}