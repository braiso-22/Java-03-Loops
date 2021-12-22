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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int m, n, aux;

        System.out.println("Escribe 2 numeros y te digo los que hay entre ellos"
                + " y sus cuadrados");
        m = teclado.nextInt();
        n = teclado.nextInt();

        if (m < n) {
            aux = m;
            m = n;
            n = aux;
        }

        for (int i = n; i <= m; i++) {
            System.out.println(i + " " + Math.pow(i, 2));
        }
    }

}
