import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        double centígrados;
        double kelvin;

        System.out.println("Introduce los grados centígrados");
        centígrados = entrada.nextDouble();

        kelvin = centígrados + 273.15;


        System.out.println("Hay " + kelvin + "K");
    }
}
