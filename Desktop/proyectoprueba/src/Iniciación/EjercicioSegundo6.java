package Iniciación;
import java.util.Scanner;

public class EjercicioSegundo6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Dame un número entero");
        x = sc.nextInt();


        if (x % 2 == 0) {
            
            System.out.println("El número " +x+ " es par");
        }

        else{

            System.out.println("El número " +x+ " es impar");
        }
    }
}
