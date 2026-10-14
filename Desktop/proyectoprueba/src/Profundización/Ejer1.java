package Profundización;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ", ");
        }

        
        
        int i = 1;
        while (i <= 100) {
            System.out.print(i + ", ");
            i++;
        }

        
        
        i = 1;
        do {
            System.out.print(i + ", ");
            i++;
        } while (i <= 100);
    }

}
