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
public class Ej31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int enVenta, entradasCompradas, compraAlta = 0;
        System.out.println("Cuantas entradas pondrás a la venta? ");
        enVenta = teclado.nextInt();

        while (enVenta > 0) {
            System.out.println("Cuantas entradas quieres comprar? Max:10");
            entradasCompradas = teclado.nextInt();

            while (entradasCompradas > enVenta || entradasCompradas > 10 || entradasCompradas < 0) {
                if (entradasCompradas > enVenta) {
                    System.out.printf("No hay tantas entradas, solo quedan %d\n", enVenta);
                } else {
                    System.out.println("Has introducido una cantidad incorrecta"
                            + " vuelve a introducir las entradas que quieres");
                }
                entradasCompradas = teclado.nextInt();
            }

            System.out.println("Has comprado " + entradasCompradas + " entradas\n");

            if (entradasCompradas > compraAlta) {
                compraAlta = entradasCompradas;
            }
            enVenta = enVenta - entradasCompradas;

        }
        System.out.println("La persona que más entradas ha comprado compró: " + compraAlta);
    }

}
