import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        double número;
                    
        System.out.println("Introduce un número decimal");
        número = entrada.nextDouble();
        

        int entero = (int) número;

        System.out.println("ese número decilam es " + entero + " como número entero");



    }
}