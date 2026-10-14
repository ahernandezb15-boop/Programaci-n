import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        double a;
        double b;
        double c;
        double media;

        System.out.println("Dame un numerín master");
        a = entrada.nextDouble();


        System.out.println("Dame otro, genio");
        b = entrada.nextDouble();


        System.out.println("Uno último porfi");
        c = entrada.nextDouble();

        media = 3 / (a + b + c);


    
    

        System.out.println("El resultado es " + media );
    }
}