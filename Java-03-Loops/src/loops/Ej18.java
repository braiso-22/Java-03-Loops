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
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;

        System.out.print("Las tablas del 1 al 9 son:");
        for (int i = 1; i < 10; i++) {
            for (int count = 1; count <= 10; count++) {
                System.out.println(numero + "x" + count + "=" + numero * count);
                if (count >= 10) {
                    numero++;
                }
            }
        }
    }

}
