/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        System.out.printf("La suma de los valores del arreglo es: %s\n",
                arreglo(informacion));
    }

    public static int arreglo(int arreglob[][]) {
        int suma = 0;
        for (int f = 0; f < arreglob.length; f++) {
            for (int c = 0; c < arreglob.length; c++) {
                suma = suma + arreglob[f][c];
            }
        }
        return suma;
    }
}
