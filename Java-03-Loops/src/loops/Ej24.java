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
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0,
                suma = 0;
        for (int i = 0; i < 15 && numero <= 1000; i++) {
            System.out.println("Introduce un número y te digo la suma");
            numero = teclado.nextInt();
            suma += numero;
            System.out.println("La suma es: " + suma);
        }
    }

}
