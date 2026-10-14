import java.util.Scanner;

public class Seleccion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String nombre;
        
        
        System.out.println("Dime tu edad");
        x = sc.nextInt();

        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();
        
//Preferible utilizar el if-else-if con solo 3 cuestiones
        
        if (x >= 18){
            System.out.println("Vaya lorzas maritrini");
        
            if(nombre.equals("Juan")){
                System.out.println("Hola Juan");
            }

            else{
                System.out.println("Tu no eres Juan");
            }
            
        
        }

        else if (x < 40){
            System.out.println("buen culo mercedes");
        }

        else{
            System.out.println("siseven");
        }

    }
    
    
    
}