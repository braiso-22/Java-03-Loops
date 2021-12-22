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
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*El programa intenta mostrar por pantalla todos los divisores del 
        numero introducido por teclado, pero tiene un error ya que el bucle no
        para cuando llega al 0, lo que proboca una excepcion*/
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();
        if (num >= 0 || num <= 1000) {
            for (int i = num; num >= 1; i--) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Numero incorrecto.");
        }
    }

}
