public class Comillas {

    public static void main(String[] args) {
        String cadena = """
        Hola cómo estas, pues nada aquí en clase de programación, conlos alumnos, empezando con lo primero.
        """;
        System.out.println(cadena);
    
        int x = 1;
        int y = x + 1;
        int z = ++ x;

        x += 1; //x = x + 1

        System.out.println("y = " + y + ", z = " + z);
    }
}
