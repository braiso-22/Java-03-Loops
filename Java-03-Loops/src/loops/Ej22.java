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
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Este codigo no funciona como se espera si no que 
        muestra las potencias de 2
        
        
        int ant = 1, ant2 = 0, num;
        for (int i = 1; i <= 12; i++) {
            num = ant + ant2;
            System.out.println(num);
            ant = num;
            ant2 = ant;

        }*/
        int num = 1, ant = 0;

        System.out.println(ant);
        System.out.println(num);

        for (int i = 1; i <= 10; i++) {
            num += ant;
            System.out.println(num);
            ant=num-ant;
        }

    }
}
