/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author JonathanCoronel
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del ejercicio04
        int numerador = 1;
        int denominador = 1;
        double resultado ;
        double suma = 0;
        String signo;
        String cadena = "";
        int contador = 1;
        while (contador <= 8) {
            if (contador % 2 == 1) {
                signo = "+";
                suma = suma + (numerador / (double) denominador);

            } else {
                signo = "-";
                suma = suma - (numerador / (double) denominador);
            }

            cadena = String.format("%s%s%d/%d ", cadena, signo, numerador,
                    denominador);
            denominador = denominador + 2;
            contador = contador + 1;
        }
        resultado = suma;
        System.out.printf("%s\nLa suma de la serie es: %.3f\n",
                 cadena, resultado);
    }

}
