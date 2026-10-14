package Iniciación;
import java.util.Scanner;


public class EjercicioSegundo3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x;

        
        System.out.println("Dime un número entero");
        x = sc.nextInt();

        if (x >= 0){

            System.out.println("Este número es positivo");
        }
        
        else{
                
            System.out.println("Este número es negativo");
        }

        }
        
}
