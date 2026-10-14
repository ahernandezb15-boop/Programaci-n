package Profundización;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        for(int x = 200; x <=400; x = x +2){
            System.out.print(x + ", ");
        }
    }

}



/* mejor se hace así para números pares:

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        for(int x = 200; x <=400;){
            if (i % 2 == 0){
            System.out.print(x + ", ");
            }
        }
    }

}
    
*/