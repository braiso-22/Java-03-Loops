/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops.Ej27;

/**
 *
 * @author Brais
 */
public class d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; i >= 10 - j; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}
