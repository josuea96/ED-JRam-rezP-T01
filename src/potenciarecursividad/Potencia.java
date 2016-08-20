//Josué Alexis Ramírez Pérez A00513622 ITIC 5ª Semestre
package potenciarecursividad;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josuealexis96
 */
public class Potencia {
    
    public static int potenciarecursividad(int n, int p, int aux, int aux2, int aux3){
        //en caso de que la potencia sea 1, se saldra del programa para arrojar el valor
        //porque todo número elevado a la 1 es el mismo número que se dio, en caso contrario

        if (p == 1){//Caso Base
            aux = n * 1; //Si la potencia que el usuario dio es igual a 1 entonces termina el ciclo
            return aux;
        }
        else{
            if (p == 0){ //Si la potencia que el usuario dio es igual a 0 entonces termina el ciclo
                aux = 1;
                return aux;
            }
            else{//Caso Recursivo, el método se volvera a pedir hasta que la potencia sea
                //igual a 1
                aux3 = n;//Una de las variables toma el valor del número que originalmente se dio
                n = n * aux2;//La variable que contiene 
                aux = n;
                System.out.println(aux3 + "x" + aux2 + " = " + aux);//Despliega el resultado actual multiplicado por
                //el número que se dio al principio y manda el resultado y así sucesivamente
                return potenciarecursividad(n, p - 1, aux, aux2, aux3);//Caso Recursion, se le resta 1 a la potencia
                //y se dejan los mismos valores de las variables, lo unico que cambia
                //es la potencia
            }
        }
    }
    
}
