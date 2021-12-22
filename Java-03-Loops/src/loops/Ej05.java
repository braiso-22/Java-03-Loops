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
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int aux = 0;

        do {
            System.out.println("Introduce números para sumar, cuando quieras "
                    + "parar, introduce un -1");
            numero = teclado.nextInt();
            aux += numero;

        } while (numero != -1);

        System.out.println("El total es: " + (aux - numero));
    }

}
