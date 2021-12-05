/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author JonathanCoronel
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del ejercicio02
        int numero1 = 1;
        int numero2 = 2;
        int resultado;
        String cadenaFinal = "";
        int contador = 1;

        while (contador <= 10) {
            resultado = numero1 * numero2;
            numero1 = numero1 + 1;
            numero2 = numero2 + 1;
            contador = contador + 1;
            cadenaFinal = String.format("%s%d ", cadenaFinal, resultado);
        }
        System.out.printf("%s", cadenaFinal);
    }

}
