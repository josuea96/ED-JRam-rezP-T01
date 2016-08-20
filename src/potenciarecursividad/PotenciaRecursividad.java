//Josué Alexis Ramírez Pérez A00513622 ITIC 5ª Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potenciarecursividad;

import java.util.Scanner;

/**
 *
 * @author josuealexis96
 */
public class PotenciaRecursividad {

    public static void main(String[] args) {
        
        int n, p, m, aux2, aux3 = 0;//Se declaran las variables que se usaran
        int aux = 0;
        Scanner sc = new Scanner (System.in);//Pregunta
        //al usuario que número de escalones que quiere bajar
        
        System.out.print("¿Qué número quieres elevar a una potencia? ");
        n = sc.nextInt();//Se guarda el resultado en la variable n
        aux2 = n;
        
        System.out.print("¿A que potencia quieres elevar el número? ");
        p = sc.nextInt();//Se guarda el resultado en la variable p
        
        System.out.println(Potencia.potenciarecursividad(n, p, aux, aux2, aux3));//Se imprime
        //el metodo de la clase potencia
                
    }  
}
