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
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i < 10000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j != i) {
                    suma = suma + j;
                }

            }
            if (suma == i) {
                System.out.println(i);

            }
            suma = 0;
        }
    }

}
