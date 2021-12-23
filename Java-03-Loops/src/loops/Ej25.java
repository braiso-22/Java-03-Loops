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
public class Ej25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String genero,
                generoJoven = "";
        int edad = 80,
                joven = 71,
                mediaM = 0,
                mujeres = 0;

        boolean viejo = false,
                //variable para comprobar que se ha introducido un valor que no sea 0
                noCero = false,
                noPuedeTrabajar;

        System.out.println("Introduce tu edad(16-70) y tu genero(H/M)");
        for (int i = 1; i <= 30; i++) {
            edad = Integer.parseInt(teclado.nextLine());
            noPuedeTrabajar = edad > 70 || edad < 16;
            if (edad == 0) { //para salir del programa
                break;
            } else if (noPuedeTrabajar) { //evita edades no validas
                System.out.println("Edad no valida\n");

                i--;
            } else {
                genero = teclado.nextLine();
                System.out.println(i + " Siguiente\n");
                noCero = true; //para confirmar que hay un valor valido

                if (edad < joven) { //para saber quien es el mas joven
                    joven = edad;
                    generoJoven = genero;
                }
                if (genero.toUpperCase().equals("M")) {
                    mediaM = mediaM + edad;
                    mujeres = mujeres + 1;
                }
                if (edad > 60) {
                    viejo = true;
                }
            }
        }
        noPuedeTrabajar = edad > 70 || edad < 16;

        if (noPuedeTrabajar || noCero) {

            if (mujeres != 0) {
                mediaM = mediaM / mujeres; //para que no haya error de division /0
            }

            System.out.println("La persona más joven es de:\n"
                    + "-Genero: " + generoJoven + "\n"
                    + "-Edad: " + joven + "\n");
            if (mujeres > 0) {
                System.out.println("La edad media en mujeres es: " + mediaM);
            } else {
                System.out.println("No hay mujeres en la empresa");
            }

            if (viejo) {
                System.out.println("Hay un mayor de 60");
            }

        } else {
            System.out.println("No se hizo ninguna entrada");
        }
    }

}
