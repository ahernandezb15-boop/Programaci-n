package Profundización;
import java.util.Scanner;

public class Ejer5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        
        System.out.println("Dame un número para mostrar su tabla de multiplicar");
        x = sc.nextInt();

        while(x != 0) {
        if(x < 100){
            for(int y = 1; y <= 10; y++){
                
            System.out.println(x + "x" + y + " = " + (x * y));
        }
    }
        else{
            System.out.println("Error");
        }
    
        System.out.println("Dame un número para mostrar su tabla de multiplicar o 0 para salir");
        x = sc.nextInt();

    }
    
    }
}
