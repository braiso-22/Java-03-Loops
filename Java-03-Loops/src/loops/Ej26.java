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
public class Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número positivo:");
        numero = teclado.nextInt();
        boolean hola = true;

        for (int i = 0; i < numero; i++) {
            if (hola) {
                System.out.println("hola");
                hola = false;
            } else {
                System.out.println("adios");
                hola = true;
            }
        }
    }

}
