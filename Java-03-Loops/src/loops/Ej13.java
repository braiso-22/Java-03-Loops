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
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float numero;

        do {
            System.out.println("Escribe un numero positivo");

            numero = a.nextFloat();

            if (numero <= 0) {
                System.out.println("Tiene que ser un positivo\n");
            }

        } while (numero <= 0);

        System.out.println("Todo correcto");
    }

}
