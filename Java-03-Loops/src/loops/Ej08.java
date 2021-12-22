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
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        int aux = 0;

        System.out.print("Introduce un número y de digo la suma de los 100 "
                + " siguientes numeros:");
        n = teclado.nextInt();

        for (int i = n; i <= n + 100; i++) {
            aux += i;
        }
        System.out.println(aux);
    }

}
