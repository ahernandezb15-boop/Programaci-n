package Iniciación;
import java.util.Scanner;


public class EjercicioSegundo4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Dame un número");
        x = sc.nextInt();

        System.out.println("Dame otro número");
        y = sc.nextInt();

        if (x > y){

            System.out.println("El número " + x + " es mayor que " + y);
        
        }

        else if (x < y){

            System.out.println("El número " + x + " es menor que " + y);
        }

        else{
        
            System.out.println("El número " + x + " es igual a " + y);
        }

    }
}
