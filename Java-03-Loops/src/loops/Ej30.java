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
public class Ej30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int enVenta, ini, comprar, masEntradas = 0;
        System.out.println("Cuantas entradas pondrás a la venta? ");
        enVenta = teclado.nextInt();
        ini = enVenta;

        while (enVenta > 0) {
            System.out.println("Cuantas entradas quieres comprar? Max:10");
            comprar = teclado.nextInt();

            if (comprar > 10) {
                comprar = 10;
                System.out.println("El máximo de entradas que puedes comprar es 10 \n");
            }
            System.out.println("Has comprado " + comprar + " entradas\n");
            if (comprar > masEntradas) {
                masEntradas = comprar;
            }
            enVenta = enVenta - comprar;

        }
        System.out.println("La persona que más entradas ha comprado compró: " + masEntradas);
    }

}
