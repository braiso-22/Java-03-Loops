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
public class Ej29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num1, num2,
                contador = 0,
                suma = 0,
                producto = 1;
        float media = 0;

        System.out.println("Introduce 2 números y te digo la suma, "
                + "media y producto de los números entre esos 2");

        num1 = a.nextInt();
        num2 = a.nextInt();

        //intercambiar valores si están al revés
        if (num1 > num2) {
            num1 += num2;
            num2 = num1 - num2;
            num1 -= num2;
        }

        for (int i = num1 + 1; i < num2; i++) {
            producto = producto * i;
            suma += i;
            contador++;
        }

        media = (float) suma / contador;

        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("El producto es: " + producto);
    }

}
