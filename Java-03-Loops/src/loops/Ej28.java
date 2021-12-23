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
public class Ej28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Los numeros divisibles por 3 son:");

        for (int i = 6; i <= 10000; i += 3) {
            System.out.println("La suma de las cifras de " + i + " es multiplo de 3");
        }
        /*
        int a;
        for (int i = 6; i <= 10000; i++) {
            a = i;
            int suma = 0;
            while (a > 0) {
                suma = suma + (a % 10);
                a = a / 10;
            }
            if (suma % 3 == 0) {
                System.out.println("La suma de las cifras de " + i + " es multiplo de 3");
            }
        }*/

    }

}
