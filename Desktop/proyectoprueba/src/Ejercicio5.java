import java.util.Scanner;

public class Ejercicio5{

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        int altura;
        int peso;
        int IMC;
        

        System.out.println("Introduce tu nombre");
        nombre = entrada.next();

        System.out.println("Introduce tu edad");
        edad = entrada.nextInt();

        System.out.println("Introduce tu altura");
        altura = entrada.nextInt();

        System.out.println("Introduce tu peso");
        peso = entrada.nextInt();

        
        IMC = peso / (altura * altura);
         
                

        System.out.println(nombre + ", tu IMC es de " + IMC);
        
        }

        
}
