package Iniciación;
import java.util.Scanner;


public class EjercicioSegundo7 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double a;
    double b;
    double c;
    double media;

    System.out.println("Dame un número");
       a = sc.nextDouble(); 

    System.out.println("Dame otro");
        b = sc.nextDouble();

    System.out.println("Dame otro");
        c = sc.nextDouble();


        media = (a + b + c)/3;

        if (media > 10){
            System.out.println("La media " + media + " es mayor a 10");
        }

        else if (media < 10){
            System.out.println("La media " + media + " es menor a 10");
        }

        else{
            System.out.println("La media " + media + " es igual a 10");
        }

    }

}
