# Java-03-Loops

<ol>
  <li>
    Mostrar por pantalla la frase “esto es un bucle” 10 veces.
  </li>
  <br>
  <li>
    Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado
    previamente.
  </li>
  <br>
  <li>
    Diseñar un algoritmo que permita introducir números positivos y nos vaya
    informando uno a uno si es par o impar. El programa finalizará cuando se introduzca un
    número negativo. Hacer dos versiones, una primera con una lectura de teclado adelantada
    (antes de entrar en el bucle) y otra versión en la que la lectura de datos se haga
    únicamente al principio del bucle.
  </li>
  <br>
  <li>
    Diseñar un programa capaz de leer un valor entero, que verifique que esté
    comprendido entre 1 y 10, y mostrar su tabla de multiplicar.
  </li>
  <br>
  <li>
    Sumar una cantidad de números que se van introduciendo, siempre que sean
    positivos hasta que se teclee el -1.
  </li>
  <br>
  <li>
    Diseñar un programa que muestre los números pares comprendidos entre 100 y 1 en
    orden descendente.
  </li>
  <br>
  <li>
    Indica la funcionalidad del siguiente programa. ¿Tiene algún error?¿Falta alguna
    llave? ¿Podrías reducir el recorrido del for para que el programa sea más rápido,
    manteniendo su funcionalidad?
  </li>
  
  ```java
package ejercicios;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();
        if (num < 0 && num > 1000)
            System.out.println("Numero incorrecto.");
         else
            for (int i = num; num >= 1; i--) 
                if (num % i == 0) 
                    System.out.println(i);
    }
}
  ```
  <br>
  <li>
    Calcular la suma de los 100 números siguientes a uno tecleado previamente.
  </li>
  <br>
  <li>
    Sumar una cantidad de números que se van introduciendo por teclado hasta que la
    suma de los mismos valga más de 100.
  </li>
  <br>
  <li>
    Programa al que se le introduzcan las edades de los alumnos (-1 para finalizar) y nos
    informe si hay alguno menor de edad.
  </li>
  <br>
  <li>
    Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre los
    números comprendidos entre ellos ordenados ascendentemente, junto con el valor de
    elevar cada uno de esos números al cuadrado. No se sabe si m > n, pero se desea utilizar
    una sola sentencia repetitiva tanto si m > n como si m < n.
  </li>
  <br>
  <li>
    Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de una clase
    con decimales. Se introducirá –1 para indicar que no hay más notas. El algoritmo informará
    del total de notas introducidas, calculará la nota mínima, máxima , la media, si hay algún
    5.0 exacto, y el porcentaje de aprobados. Hay que validar que estén entre 0 y 10.
  </li>
  <br>
  <li>
  </li>
    
</ol>
