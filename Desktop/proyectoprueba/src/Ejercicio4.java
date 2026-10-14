import java.util.Scanner;

public class Ejercicio4{

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        int año_nacimiento;
        final int año = 2026;
    
        

        System.out.println("Introduce tu nombre");
        nombre = entrada.next();

        System.out.println("Introduce tu año de nacimiento");
        año_nacimiento = entrada.nextInt();



        
        edad = año_nacimiento - año;
         
        
        System.out.println(nombre + ", tienes " + edad + " años");
        

        

    }

}