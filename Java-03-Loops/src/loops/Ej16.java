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
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = (int) (Math.random() * 99);
        int numero = 0;

        System.out.println("Adivina el número entre 0 y 99");
        //System.out.println(valor);

        for (int i = 0; i < 5; i++) {
            numero = teclado.nextInt();

            if (valor == numero) {
                System.out.println("Acertaste, era " + valor);
                break;
            } else if (numero > valor) {
                System.out.println("El número que buscas es más pequeño");
            } else {
                System.out.println("El número que buscas es más grande");
            }
        }
        if (valor != numero) {
            System.out.println("No has acertado, el número era " + valor);
        }
    }

}
