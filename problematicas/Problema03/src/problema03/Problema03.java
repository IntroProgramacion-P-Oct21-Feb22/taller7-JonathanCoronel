/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author JonathanCoronel
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del ejercicio03
        int numero1 = 1;
        int numero2 = 1;
        double resultado;
        String cadenaFinal = "";
        int contador = 1;
        do {
            resultado = Math.pow(numero1, 2) + numero2;
            numero1 = numero1 + 1;
            contador = contador + 1;
            cadenaFinal = String.format("%s%.0f ", cadenaFinal, resultado);
        } while (contador <= 6);
        System.out.printf("%s", cadenaFinal);
    }

}
