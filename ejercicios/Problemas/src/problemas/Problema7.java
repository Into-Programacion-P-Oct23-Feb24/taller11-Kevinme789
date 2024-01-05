/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */

public class Problema7 {
    public static void main(String[] args) {
        String[] arreglos = arreglo();
        System.out.println();
        caracteres(arreglos);
    }
    public static String[] arreglo(){
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.println("Ingrese el numero de valores para su arreglo");
        a = sc.nextInt();
        sc.nextLine();
         String[] arreglos = new String[a];
        for (int f = 0; f<arreglos.length;f++){
            System.out.println("Ingrese el nombre de una ciudad");
            arreglos[f] = sc.nextLine();
        }
        return arreglos;
}
    public static void caracteres(String arreglo[]){
    int numCaracteres;
    for (int f = 0;f<arreglo.length;f++){
        numCaracteres=arreglo[f].length();
        if(numCaracteres==5 ||numCaracteres==4 ){
            System.out.println(arreglo[f]);
        }
    
    }
    }
}
