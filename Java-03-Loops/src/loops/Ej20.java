/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0,
            numero2;

        System.out.println("Introduce números en orden ascendente y pulsa "
                + "0 para cerrar el programa");

        numero2 = teclado.nextInt();

        while (numero2 != 0 && numero < numero2) {
            numero = numero2;
            numero2 = teclado.nextInt();

        }
        System.out.println("Saliendo...");
    }

}
