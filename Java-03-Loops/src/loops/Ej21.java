/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author Brais
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean esPrimo;

        System.out.println("Los números primos del 2 al 1000 son: ");
        System.out.println("2");
        for (int i = 3; i <= 1000; i += 2) {
            esPrimo = true;
            for (int j = 3; j <= i / 2; j += 2) {
                if ((i % j == 0)) {
                    esPrimo = false;
                    break;
                }

            }
            if (esPrimo) {
                System.out.println(i);
            }
        }

    }
}
