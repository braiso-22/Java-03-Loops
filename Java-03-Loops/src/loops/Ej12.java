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
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float nota,
                total = 0,
                maxima = -1,
                media;
        int contador = 0;

        boolean cinco = false,
                valido;

        do {
            System.out.println("Escribe las notas de todos los alumnos.\nPara "
                    + "salir escribe -1");

            nota = a.nextFloat();

            valido = nota < 11 && nota >= 0;

            if (valido) {

                contador++;
                total = total + nota;

                if (maxima < nota) {
                    maxima = nota;
                }
                if (nota == 5) {
                    cinco = true;
                }
            } else if (nota != -1) {
                System.out.println("Ese valor no vale\n");
            }

        } while (nota != -1);

        if (contador >= 1) {
            media = total / contador;
            System.out.println("La nota media es: " + media);
            if (cinco) {
                System.out.println("Ha habido un 5 en la clase");
            }
            System.out.println("La maxima nota ha sido un: " + maxima);
        } else {
            System.out.println("No has metido ninguna nota");
        }
    }

}
