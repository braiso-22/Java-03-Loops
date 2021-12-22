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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        boolean seguir, menor = false;

        do {
            System.out.println("Introduce edades de los alumnos, para salir  "
                    + "introduce un -1");
            edad = teclado.nextInt();
            if (menor == false) {
                menor = edad < 18 && edad != -1;
            }
            seguir = edad != -1;
        } while (seguir);

        if (menor) {
            System.out.println("Hay un menor en clase");
        }
    }

}
