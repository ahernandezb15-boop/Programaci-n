package Iniciación;
import java.util.Scanner;


public class EjercicioSegundo5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Dame un número entero");
        a = sc.nextInt();

        System.out.println("Dame otro diferente");
        b = sc.nextInt();


        if (a > b){
            
            System.out.println("El orden es: " + a + ", " + b);
        }

        else if (a < b){
            
            System.out.println("El orden es: " + b + ", " +a);
        }

        else{

            System.out.println("QUE SEAN DIFERENTES SUBNORMAL");
        }

    }
}
