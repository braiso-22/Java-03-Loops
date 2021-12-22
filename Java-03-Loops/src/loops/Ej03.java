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
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean positivo, par;
        do {
            System.out.println("- Introduce un número y te digo si es par o no"
                    + "\n- Escribe un número negativo para salir");
            numero = teclado.nextInt();
            positivo = numero >= 0;
            par = numero % 2 == 0;
            if (positivo) {
                if (par) {
                    System.out.println(numero + " es par\n");
                } else {
                    System.out.println(numero + " es impar\n");
                }
            }
        } while (positivo);
        /*
        System.out.println("- Introduce un número y te digo si es par o no"
                + "\n- Escribe un número negativo para salir");
        numero = teclado.nextInt();
        positivo = numero >= 0;
        par = numero % 2 == 0;
        while (positivo) {

            if (par) {
                System.out.println(numero + " es par\n");
            } else {
                System.out.println(numero + " es impar\n");
            }

            System.out.println("1.- Introduce un número y te digo si es par o no"
                    + "\n2.- Escribe un número negativo para salir");
            numero = teclado.nextInt();
        */
    }

}
