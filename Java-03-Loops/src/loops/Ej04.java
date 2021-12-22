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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("1.- Introduce un número del 1 al 10 "
                + "y te digo su tabla: ");
        numero = teclado.nextInt();
        boolean valido = numero > 0 && numero <= 10;

        if (valido) {
            for (int count = 1; count <= 10; count++) {
                System.out.printf("%dx%d=%d\n",numero,count,(numero*count));
            }
        } else {
            System.out.println("Introduce numeros del 1 al 10");
        }
    }

}
