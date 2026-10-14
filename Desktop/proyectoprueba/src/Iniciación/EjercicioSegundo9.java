package Iniciación;
import java.util.Scanner;

public class EjercicioSegundo9 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.println("dime un número entre el 1 y el 7");
    num = sc.nextInt();
    
    switch (num){
        case 1: System.out.println("Lunes"); break;

        case 2: System.out.println("Martes"); break;
        
        case 3: System.out.println("Miercoles"); break;
        
        case 4: System.out.println("Jueves"); break;
        
        case 5: System.out.println("Viernes"); break;
        
        case 6: System.out.println("Sábado"); break;
        
        case 7: System.out.println("Domingo"); break;
        
        default: System.out.println("no está en el rango especificado");
    }

    }
}
