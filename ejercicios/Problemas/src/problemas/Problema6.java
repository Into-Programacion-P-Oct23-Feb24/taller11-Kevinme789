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
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        System.out.printf("La media aritmetica es: %.2f\nEl valor de la "
                + "desviacion estandar es de: %.2f\n",
                arreglo(informacion), mediaStandard
        (informacion, arreglo(informacion)));
    }

    public static double arreglo(int arreglob[]) {
        double suma = 0;
        double media;
        for (int f = 0; f < arreglob.length; f++) {
            suma = suma + arreglob[f];
        }
        media = (double) suma / arreglob.length;
        return media;
    }

    public static double mediaStandard(int arreglob[], double media) {
        double suma = 0;
        double mediaS;
        double[] arreglo = new double[9];
        for (int f = 0; f < arreglob.length; f++) {
            arreglo[f] = (arreglob[f] - media);
            arreglo[f] = arreglo[f] * arreglo[f];
        }
        for (int f = 0; f < arreglob.length; f++) {
            suma = suma + arreglo[f];
        }
        mediaS = suma / (arreglob.length - 1);
        mediaS = Math.sqrt(mediaS);
        return mediaS;
    }
}
