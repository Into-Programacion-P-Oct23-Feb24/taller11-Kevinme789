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
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos.length; c++) {
                if (datos[f][c] % 2 == 0) {
                    System.out.println(datos[f][c]);
                }

            }

        }

    }

}
