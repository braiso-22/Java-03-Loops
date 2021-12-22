/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author Brais
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Este codigo lo que hace es mostrar por consola 
        todas las horas que tiene una semana
         */
        int hora = 0;
        for (int i = 1; i <= 7 * 24; i++) {
            System.out.println(hora);
            if (++hora > 23) {
                hora = 0;
            }
        }
    } //fin main
}//fin clase
