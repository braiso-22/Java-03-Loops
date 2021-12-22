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
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int aprobado = 5, asignaturas = 9;
        int nota = 5;

        System.out.println("Introduce las notas de tus nueve asignaturas y te "
                + "diré si puedes ir a las practicas");

        for (int i = 1; i <= asignaturas && nota >= aprobado; i++) {
            nota = teclado.nextInt();
            if (nota < aprobado) {
                System.out.println("No puedes ir a las prácticas");
            } else if (i == 9) {
                System.out.println("Puedes ir a las prácticas");
            }
        }

        /*
        El programa anterior funciona, pero no necesitamos todas las
        notas para saber si va a poder hacer la FCT ya que si ha suspendido 
        alguna no puede hacer la FCT. 
        
        Por lo anterior que he comentado creo que sería mejor preguntar 
        directamente si ha suspendido alguna:
        
        Scanner a = new Scanner(System.in);
        char notas = 'y';
        int i = 0;
        System.out.println("Has aprovado todas? Y/n");

        while (i != 1) {

            notas = Character.toLowerCase(a.nextLine().charAt(0));

            switch (notas) {
                case 'y':
                    System.out.println("Puedes hacer la FCT");
                    i++;
                    break;
                case 'n':
                    System.out.println("No puedes hacer la FCT");
                    i++;
                    break;
                default:
                    System.out.println("Elige entre y/n");
            }

        }
        
        }*/
        
    }
}
