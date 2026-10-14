import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        double pulgadas;
        double centímetros;
        double metros;

        System.out.println("Introduce pulgadas");
        pulgadas = entrada.nextDouble();
        

        centímetros  = pulgadas * 2.54;
        metros = pulgadas / 39.3701;

        System.out.println("Te da " + centímetros +"cm y " + metros + "m" );


    }
}