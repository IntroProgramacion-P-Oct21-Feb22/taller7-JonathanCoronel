/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del ejercicio01

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre_jugador;
        String posicion;
        int edad;
        boolean bandera = true;
        double estatura;
        int contador = 0;
        int salida;
        double sumaedad = 0;
        double sumaestatura = 0;
        double pro_edades;
        double pro_estaturas;
        String cadena_edad = "";
        String cadena_final = "";

        do {
            System.out.println("Escriba el nombre del juagdor");
            nombre_jugador = entrada.nextLine();
            System.out.println("Ingrese la Posición en el campo de juego");
            posicion = entrada.nextLine();
            System.out.println("Escriba la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Escriba la estatura del jugador");
            estatura = entrada.nextDouble();
            cadena_edad = String.format("%s %d ", cadena_edad, edad);
            contador = contador + 1;
            sumaestatura = sumaestatura + estatura;
            sumaedad = sumaedad + edad;
            cadena_final = String.format("%s%d.%s-%s-, edad %d, estatura %.2f\n",
                    cadena_final, contador, nombre_jugador,
                    posicion, edad, estatura);
            System.out.println("Escriba -1 para salir del programa");
            salida = entrada.nextInt();
            entrada.nextLine();
            if (salida == -1) {
                bandera = false;
            }
        } while (bandera);
        pro_estaturas = sumaestatura / contador;
        pro_edades = sumaedad / contador;
        System.out.printf("%s\nListado de Edades: %s Promedio edades: %.2f "
                + "Promedio estaturas: %.2f\n", cadena_final,
                cadena_edad, pro_edades, pro_estaturas);

    }

}
