package Iniciación;

import java.util.Scanner;

public class EjercicioSegundo11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String selec;

        System.out.println("Menú");
        System.out.println("1.- Abrir");
        System.out.println("2.- Cerrar");
        System.out.println("3.- Conectar");
        System.out.println("4.- Desconectar");
        System.out.println("5.- Fin");

        System.out.println("Elige una opción:");

        //  aquí se puede hacer: 
        //
        //System.out.println("""
        //Menú
        //1.- Abrir
        //2.- Cerrar
        //3.- Conectar
        //4.- Desconectar
        //5.- Fin
        //Elige una opción: 
        //""");
        
    

        selec = sc.next();

        switch (selec) {
            case "Abrir":
                System.out.println("Has seleccionado Abrir.");
                break;

            case "Cerrar":
                System.out.println("Has seleccionado Cerrar.");
                break;

            case "Conectar":
                System.out.println("Has seleccionado Conectar.");
                break;

            case "Desconectar":
                System.out.println("Has seleccionado Desconectar.");
                break;

            case "Fin":
                System.out.println("Has seleccionado Fin.");
                break;

            default:
                System.out.println("Eso no está en el rango de opciones.");
        }
    }
}
