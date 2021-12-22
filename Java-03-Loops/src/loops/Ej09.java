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
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int aux = 0;

        do {
            System.out.println("Introduce números para sumarlos, cuando se"
                    + " llegue a 100 o mas se parará");
            numero = teclado.nextInt();
            aux += numero;

        } while (aux < 100);

        System.out.printf("El total es: %d\n", aux);
    }

}
