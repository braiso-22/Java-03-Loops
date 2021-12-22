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
    <ul>
      <li>
        Hay que pensar primero el bucle: el código ser repite mientras.....
        Una vez aclarado esto, puedes pensar qué es lo que se hace cada
        vez (en este caso, qué hago con cada nota introducida)
      </li>
      <li>
        Para calcular la nota máxima hay que tener guardada en una
        variable la máxima hasta ese momento y al leer una nueva nota,
        compararla la nueva con la guardada, y si la nueva es mayor que
        la guardada, guardamos la nueva, ya que ahora es la máxima y así
        para todas las iteraciones del bucle (para empezar puedes decir
        que la máxima nota es -1)
      </li>
      <li>
        Para calcular la media hay que ir acumulando los valores y la
        cantidad de elementos, y al final dividir lo acumulado entre la
        cantidad de elementos.
      </li>
    </ul>
  </li>
  <br>
  <li>
    Programa al que le introduzcas un número y que garantice que es positivo, es decir
    si lo introducimos menor o igual que cero nos obligará a volver a introducirlo las veces que
    sea necesario hasta que se introduzca uno positivo.
  </li>
  <br>
  <li>
    Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000.
    Un número perfecto si es igual a la suma de todos los divisores menores que él.
  </li>
  <br>
  <li>
    Sin ejecutarlo, intenta explicar que hace este programa.
  </li>
  <br>
  
  ```java
  public class Ejercicios {
    public static void main(String[] args) {
      int hora=0;
      for (int i=1;i<=7*24;i++) {
        System.out.println (hora);
        if (++hora > 23) hora=0;
      }
    } //fin main
  } //fin clase  
  ```
  <br>
  <li>
    Programar el siguiente juego. El ordenador genera un número al azar entre 0 y 99
    que habrá que adivinar. El jugador intentará adivinar el número y el programa le
    responderá si es mayor, menor o si ha acertado. Se dispone de un máximo de 5 intentos.
  </li>
  <br>
  <li>
    Diseñar un algoritmo al que se le introduzcan las notas de un alumno en los nueve
    módulos de un ciclo y nos informe si puede ir a la FCT (todos aprobados). ¿Hay que
    solicitarle al usuario siempre las notas de los nueve módulos?
  </li>
  <br>
  <li>
    Mostrar las tablas de multiplicar del 1 al 9.
  </li>
  <br>
  <li>
    Diseña un algoritmo capaz de obtener la letra del DNI a partir del número de DNI.
    Consiste en dividir dicho número entre 23 y tomar el resto de la división asignándole la
    letra correspondiente según la siguiente tabla (Hacer con switch, no empleando ni arrays ni
    String)
    <table>
      <tr>
        <td>
          RESTO
        </td>
        <td>0
        </td>
        <td>
        1
        </td>
        <td>2
        </td>
        <td>
        3
        </td>
        <td>
        4
        </td>
        <td>
        5
        </td>
        <td>6
        </td>
        <td>7
        </td>
        <td>8
        </td>
        <td>9
        </td>
        <td>10
        </td>
        <td>11
        </td>
        <td>12
        </td>
        <td>13
        </td>
        <td>14
        </td>
        <td>15
        </td>
        <td>16
        </td>
        <td>17
        </td>
        <td>18
        </td>
        <td>19
        </td>
        <td>20
        </td>
        <td>21
        </td>
        <td>22
        </td>
      </tr>
      <tr>
        <td>
        LETRA
        </td>
        <td>
        T
        </td>
        <td>R
        </td>
        <td>
        W
        </td>
        <td>
        A
        </td>
        <td>
        G
        </td>
        <td>M
        </td>
        <td>Y
        </td>
        <td>F
        </td>
        <td>P
        </td>
        <td>D
        </td>
        <td>X
        </td>
        <td>B
        </td>
        <td>N
        </td>
        <td>J
        </td>
        <td>Z
        </td>
        <td>S
        </td>
        <td>Q
        </td>
        <td>V
        </td>
        <td>H
        </td>
        <td>L
        </td>
        <td>C
        </td>
        <td>K
        </td>
        <td>
        E
        </td>
      </tr>
    </table>
  </li>
  <br>
  <li>
    Programa que lea números de entrada y que informa si están ordenados
    ascendentemente o no. El programa finaliza si se introduce cero o en cuanto se detecte
    que los números no están ordenados.
  </li>
  <br>
  <li>
    Programa que muestre los número primos comprendidos entre 2 y 1000. Hacer los
    bucles con un número mínimo de iteraciones (se permite el uso de break) sabiendo que:
    <ul>
      <li>
        Un número primo es solo divisible por 1 y el mismo.
      </li>
      <li>
        Los números primos son todos impares salvo el 2.
      </li>
      <li>Los divisores de un número siempre son menores que la mitad de dicho número
          (salvo el mismo).
      </li>
      <li>
        Si un número no es divisible por 2 ya no va a serlo por ningún otro número par.
      </li>
    </ul>
  </li>
  <br>
  <li>
    La serie de Fibonacci se compone a partir de números naturales, empezando por 0 y
    1, y construyendo cada nuevo número de la serie como la suma de los dos anteriores
    elementos de la serie, así pues el tercero sería 1 (es 0 +1), el siguiente 2 (1+1), luego 3
    (2+1), luego 5 (3+2), 8 (5+3) y así sucesivamente. El siguiente programa pretende mostrar
    12 primeros números de esta serie ¿Funciona correctamente? Es decir, muestra:
    0,1,1,2,3,5,8,13,21,34,55,89. Si no es así, corrígelo.
  </li>
  <br>
  
  ```java
  package ejercicios;
  public class Ejercicios {
    public static void main(String[] args) {
      int ant=1, ant2=0, num;
      for (int i=1; i<=12; i++){
        num = ant + ant2;
        System.out.println(num);
        ant = num; ant2 = ant;
      } 
    }
  }
  ```
  
  <br>
  <li>
    Hacer un programa que permita calcular el sueldo final de los vendedores de un
    concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de horas
    extras realizadas y cantidad de ventas. El sueldo final será el sueldo base más las horas
    extras (se pagan a 100€ la hora) y un plus en función de las ventas: entre 10 y 20 ventas
    500€, entre 21 y 30 ventas  1000€ y si supera las 30 ventas  1300 €. Después de tratar
    cada vendedor se preguntará al usuario y hay más vendedores a tratar, finalizando el
    programa si contesta negativamente. Al final el programa mostrará el total de ventas y el
    salario final del que más ventas ha realizado (supón que al menos introducen los datos de
    un empleado).
  </li>
  <br>
  <li>
    Programa que permita introducir números y nos muestre el resultado de sumarlos,
    hasta que aparezca un número mayor que 1000. Si no se introduce un número mayor que
    1000 el programa finalizará después de introducidos 15 números. (Ojo: es fácil equivocarse
    y hacer que solicite un numero de más o bien que no sume correctamente)
  </li>
  <br>
  <li>
    Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad de los 30
    trabajadores de una fábrica. El programa debe obligar a que las edades que se introduzcan
    estén comprendidas entre 16 y 70 años. El programa nos mostrará la edad y el sexo del
    más joven y también mostrará la media de edad de las mujeres. Finalmente nos informará
    si hay alguno con más de 60 años. Si se introduce cero como edad el programa terminará
    en ese momento sin esperar a que introduzcan los 30 trabajadores.
  </li>
  <br>
  <li>
    Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas,
    siendo x un número entero positivo tecleado previamente (ojo: el número x puede ser par o
    impar)
  </li>
  <br>
  <li>
    Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos:
    <ol>
      <li>
      000000000<br>
      111111111<br>
      222222222<br>
      ...
      </li>
      <li>
      1<br>
      22<br>
      333<br>
      ...
      </li>
      <li>
        111111111<br>
        22222222<br>
        3333333<br>
        ...
      </li>
      <li>
        9<br>
        98<br>
        987<br>
        ...
      </li>
    </ol>
  </li>
  <br>
  <li>
    La suma de los dígitos de los números múltiplos de tres es también un múltiplo de
    tres. Realizar un programa que compruebe si esta afirmación es correcta o no para los
    primeros 10000 números enteros positivos.
  </li>
  <br>
  <li>
    Sacar por pantalla la suma, la media y el producto de los números pares
    comprendidos entre dos números enteros tecleados previamente. No sabemos si el que
    introduce primero es menor que el segundo. No incluir en los cálculos los números
    introducidos, solo los intermedios.
  </li>
  <br>
  <li>
    Hacer un programa para llevar el control de venta de entradas. Lo primero que ha de
    hacer es pedir la cantidad de entradas que se pondrán a la venta, después irá solicitando la
    cantidad de entradas que quiere comprar, estando limitado a un máximo de 10 por cliente.
    El programa finalizará cuando se agoten las entradas mostrando la cantidad de entradas
    que se ha llevado el que más ha comprado.
  </li>
  <br>
  <li>
    Modificar el programa anterior para que si un cliente introduce un número negativo o
    mayor que 10 le informe de su error y le obligue a meter correctamente las entradas que
    desea, las veces que sea necesario hasta que lo haga bien.
  </li>
    
</ol>
