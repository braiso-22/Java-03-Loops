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
public class Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sueldo, horas, ventas,
                sueldoFinal, faltan,
                ventasTotales = 0,
                masVentas = 0,
                sueldoVentas = 0;

        do {
            System.out.println("Introduce el sueldo base, las horas extra "
                    + "trabajadas y la cantidad de coches vendidos");

            sueldo = teclado.nextInt();
            horas = teclado.nextInt();
            ventas = teclado.nextInt();

            ventasTotales += ventas;
            sueldoFinal = sueldo + (horas * 100);

            if (ventas >= 10 && ventas <= 20) {
                sueldoFinal += 500;
            } else if (ventas >= 21 && ventas <= 30) {
                sueldoFinal += 1000;
            } else if (ventas > 30) {
                sueldoFinal += 1300;
            }

            if (ventas > masVentas) {
                masVentas = ventas;
                sueldoVentas = sueldoFinal;
            }

            System.out.println("Faltan trabajadores? \n"
                    + "1.- Si.\n2.- No");

            faltan = teclado.nextInt();

        } while (faltan == 1);

        System.out.println("El total de ventas fué: " + ventasTotales);
        System.out.println("La persona que más coches vendió, vendió: "
                + masVentas + " y cobró: "
                + sueldoVentas + "€");
    }

}
