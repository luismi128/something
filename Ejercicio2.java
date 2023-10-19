package EjerciciosIf;

import java.util.Scanner;

/**
 *
 * @author Sara García
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String  nombre;
        int edad;
        String sexo;
        System.out.println("Cómo te llamas?");
        nombre = teclado.nextLine();
        System.out.println("Eres hombre o mujer?");
        sexo = teclado.nextLine();
        System.out.println("Cuantos años tienes?");
        edad = teclado.nextInt();
        
        System.out.print("Te llamas " + nombre);
        if (edad >= 18)
            System.out.print(", eres mayor de edad y ");
        else
            System.out.print(", eres menor de edad y ");
        System.out.printf("eres %s.\n", sexo);
    }
    
}
